import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SteadyGeneTest {

  SteadyGene steadyGene;

  @BeforeEach
  void setUp() {
    steadyGene = new SteadyGene();
  }

  @Test
  void demo() {
    Assertions.assertEquals(1, steadyGene.minLengthOfSubStringForSteadyGene(""));
  }

}