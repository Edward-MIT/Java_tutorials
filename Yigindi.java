

public class Yigindi {
  public static void main (String[] args){

// N musbat soni berilgan. 1 dan N gacha bo'lgan sonlar yogindisini hisoblovchi dastur
    int n = 13;
    int sum = 0;

    for (int i = 1; i<=n; i ++){
      sum += i; // sum = sum +i
    }

    System.out.println("1 dan " + n + " gacha bo'lgan sonlarni yigindisi:  " + sum);

  }
}