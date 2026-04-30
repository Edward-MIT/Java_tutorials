public class Code_challange_1 {
  public static void main (String[] args){
    String soz = "kiyik";
    String reversed = new StringBuilder(soz).reverse().toString();

    if (soz.equals(reversed)){
      System.out.println(soz + " -palidrom");
    }else{
      System.out.println(soz + "- palidrom emas ");
    }
  }
}