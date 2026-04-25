public class Arithmetic {
  public static void main (String[] args){
    int peopleInRoom = 0;
    peopleInRoom ++;
    peopleInRoom ++;
    peopleInRoom ++;
    System.out.println(peopleInRoom);

    peopleInRoom--;

    System.out.println(peopleInRoom);

    // ikkinchi misol
    int x = 15;
    int y = 4;

    System.out.println("x + y = " + (x + y)) ;// 19
    System.out.println("x - y = " + (x - y )); // 11
    System.out.println("x * y = " + (x + y)) ; // 60

    // butun sonni butun songa bo'lganda natija ham butun bo'ladi
    System.out.println("x / y = " + (x / y)) ; // 3

    // Qoldiqli bo'lish moduli
    System.out.println("x % y = " + (x % y)) ; // 3 faqat qoldiq natijda chiqariladi

    // logical Operators

    // && logical and

    // || logical or , ! logical not

    boolean isLogical = true;
    boolean isAdmin = false;

    System.out.println("Regular user: " + (isLogical && !isAdmin));
    System.out.println("Has access: " + (isLogical|| isAdmin));
    System.out.println("Not looged in: " + (!isLogical));


    // coding challange

    int itemPrice = 10;
    int shippingCost = 2;
    int sum = itemPrice + shippingCost;
    System.out.println(sum);

  }

}
