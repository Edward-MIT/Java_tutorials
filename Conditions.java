public class Conditions {
  public static void main (String[] args) {
    if (20>18)
      System.out.println("20 is greater than 18");

    boolean isLightOn = false;
    if(isLightOn) {
      System.out.println("The light is on");
    }
    System.out.println("This line runs no matter what, because it is outside the statement");

    int x = 20;
    int y = 18;

  if (x > y) {
    System.out.println("x is greater than y");
    System.out.println("Both lines are part of the if");
  }

   // Some code outside if
   System.out.println("I am outside if, not part of if!");

   int age = 20;
   if (age>=18) {
    System.out.println("You can vote!");
   }else{
    System.out.println("Unfotunately you can not vote!");
   }

  }

}
