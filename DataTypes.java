public class DataTypes{
 public static void main (String[] args){
  int item = 24;
  float costPerItem = 9.88f;
  float totalCost = item * costPerItem;
  char currency = '$';

  System.out.println("Number of item: " + item);
  System.out.println("Cost per item: " + costPerItem + currency);
  System.out.println("Total cost = " + totalCost + currency);

  int a = 10;
  int b = 5;
  boolean result = (a>b) && (a % 2 ==0);
  System.out.println(result);
 }
}