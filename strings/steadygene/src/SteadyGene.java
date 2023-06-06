import java.util.*;

public class SteadyGene {

  // Find min length substring of given input to make a gene steady
  // A steady gene contains equal number of A T C G (gene.length/4)
  public int minLengthOfSubStringForSteadyGene(String gene) {

    int geneACount = extractGeneCount(gene, 'A');
    int geneTCount = extractGeneCount(gene, 'T');
    int geneGCount = extractGeneCount(gene, 'G');
    int geneCCount = extractGeneCount(gene, 'C');

    if (geneACount == gene.length() / 4 && geneTCount == gene.length() / 4
        && geneGCount == gene.length() / 4 && geneCCount == gene.length() / 4) {
      return 0;
    }

    int geneANeeded = getNeededGeneCount(gene.length(), geneACount);
    int geneTNeeded = getNeededGeneCount(gene.length(), geneTCount);
    int geneGNeeded = getNeededGeneCount(gene.length(), geneGCount);
    int geneCNeeded = getNeededGeneCount(gene.length(), geneCCount);

    String steady = compileSteadyGeneCandidate(geneANeeded, geneTNeeded, geneGNeeded, geneCNeeded);
    String origSteady = steady;

    boolean found = false;
    int frequency = -1;
    int nextLength = 1;
    int shuffleCount = 0;
    while (!found && steady.length() < gene.length()) {
      boolean shuffle = true;
      for (int j = 0; j < steady.length(); j++) {
        for (int i = 0; i < gene.length() - steady.length(); i++) {
          String tempGene = gene.replaceFirst(gene.substring(i, steady.length() + i), steady);
          found = checkSteadyGene(tempGene);
          if (found) {
            break;
          }
        }
        steady = rotateSteady(steady);
      }

      if (frequency == 4) {
        frequency = 0;
        nextLength++;
        origSteady = steady;
        shuffle = false;
      } else if (shuffleCount > steady.length()) {
        frequency++;
        shuffle = false;
      }

      if (shuffle) {
        steady = shuffleSteadyChars(steady);
        shuffleCount++;
      } else {
        steady = compileNextSteady(origSteady, frequency, nextLength);
        shuffleCount = 0;
      }

    }


    return steady.length();

  }

  private String rotateSteady(String steady) {
    char firstChar = steady.charAt(0);
    char[] steadyChars = steady.toCharArray();
    for (int i = 0; i < steady.length() - 1; i++) {
      steadyChars[i] = steadyChars[i + 1];
    }
    steadyChars[steady.length() - 1] = firstChar;
    return new String(steadyChars);
  }

  private String shuffleSteadyChars(String steady) {
    List<Character> characterList = new ArrayList<>();
    for (char c : steady.toCharArray()) {
      characterList.add(c);
    }
    Collections.shuffle(characterList, new Random(steady.length()));
    StringBuilder sb = new StringBuilder();
    for (char c : characterList) {
      sb.append(c);
    }
    return sb.toString();
  }


  private String compileNextSteady(String steady, int frequency, int nextLength) {
    StringBuilder sb = new StringBuilder(steady);
    switch (frequency) {
      case 0 -> sb.append("A".repeat(nextLength));
      case 1 -> sb.append("T".repeat(nextLength));
      case 2 -> sb.append("G".repeat(nextLength));
      case 3 -> sb.append("C".repeat(nextLength));
    }
    return sb.toString();
  }

  private boolean checkSteadyGene(String tempGene) {
    int a = extractGeneCount(tempGene, 'A');
    int t = extractGeneCount(tempGene, 'T');
    int g = extractGeneCount(tempGene, 'G');
    int c = extractGeneCount(tempGene, 'C');

    int steadyCount = tempGene.length() / 4;

    return a == steadyCount && t == steadyCount && g == steadyCount && c == steadyCount;
  }

  private String compileSteadyGeneCandidate(int geneANeeded, int geneTNeeded, int geneGNeeded, int geneCNeeded) {
    StringBuilder sb = new StringBuilder();
    if (geneANeeded > 0) {
      sb.append("A".repeat(geneANeeded));
    }
    if (geneTNeeded > 0) {
      sb.append("T".repeat(geneTNeeded));
    }
    if (geneGNeeded > 0) {
      sb.append("G".repeat(geneGNeeded));
    }
    if (geneCNeeded > 0) {
      sb.append("C".repeat(geneCNeeded));
    }
    return sb.toString();
  }

  private int extractGeneCount(String gene, char smallGene) {
    int geneCount = 0;
    for (char c : gene.toCharArray()) {
      if (c == smallGene) {
        geneCount++;
      }
    }
    return geneCount;
  }

  private int getNeededGeneCount(int geneCount, int smallGeneCount) {
    return geneCount / 4 - smallGeneCount;
  }

}