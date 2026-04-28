import java.util.Scanner;

public class Sonni_Aniqlash {
  public static void main (String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Iltimos biror son kiriiting: ");


    int son = input.nextInt();

    if (son>0) {
      System.out.println("Bu musbat son!");
    }else if(son<0){
      System.out.println("Bu manfiy son");
    }else {
      System.out.println("Bu raqam no'lga teng");
    }

  }

}
