public class DivideIntegers {

  public int divide(int dividend, int divisor) {
    float temp1= divisor;
    if(temp1 < 0) {
      temp1 = -temp1;
    }
    float temp2 = dividend;
    if(temp2 < 0) {
      temp2 = -temp2;
    }
    float counter = 0;
    while(temp2 >= temp1) {
      counter++;
      temp2 = temp2 - temp1;
    }
    if(divisor > 0 && dividend < 0) {
      counter = -counter;
    } else if(divisor < 0 && dividend > 0) {
      counter = -counter;
    }
    if(counter > Integer.MAX_VALUE) {
      return Integer.MAX_VALUE;
    }
    if(counter < Integer.MIN_VALUE){
      return Integer.MIN_VALUE;
    }
    return (int)counter;
  }


}