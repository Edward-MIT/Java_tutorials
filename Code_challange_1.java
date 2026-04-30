import java.util.Scanner;

public class Code_challange_1 {
  public static void main (String[] args){

    // Kiyik so'zini palidrom ekanini aniqlovchi dastur

    String soz = "kiyik";
    String reversed = new StringBuilder(soz).reverse().toString();

    if (soz.equals(reversed)){
      System.out.println(soz + " -palidrom");
    }else{
      System.out.println(soz + "- palidrom emas ");
    }

    // foydalanuvchi kiritgan so'zni palidrom ekanini aniqlovchi dastur
    Scanner scanner = new Scanner(System.in);

    System.out.println("So'zni kiriting: ");

    String word = scanner.nextLine();

    String reversed1 = new StringBuilder(word).reverse().toString();

    if (word.equalsIgnoreCase(reversed1)){
      System.out.println("'" + word + "'- palidrom");

    }else{
      System.out.println("'" + word + "' - palidrom emas ");
    }


    scanner.close();

  }
}
