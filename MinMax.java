public class MinMax {
  public static void main(String[] args) {
      int[] numbers = {15, 2, 34, 8, 1};
      int min = numbers[0];
      int max = numbers[0];

      for (int i: numbers){
        if (i < min ) min = i;
        if (i > max) max = i;
      }

      System.out.println("Min: " + min + ", Max: " + max);
  }

}
