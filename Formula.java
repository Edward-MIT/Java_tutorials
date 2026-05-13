public class Formula {
  public static void main (String[] args){
    int [] massiv = {3, 6, 45, 65, 34};
    int max = massiv[0];

    for (int i = 1 ; 1<massiv.length; i ++){
      if (massiv[1]>max){
        max= massiv[i];
      }
    }

    System.out.println("Massivdagi eng katta son: " + max);
  }
}
