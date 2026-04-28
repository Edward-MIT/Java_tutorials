import java.util.ArrayList;
import java.util.Scanner;

public class StudentCRUD {
  private static ArrayList<Student> students = new ArrayList<>();
  private static Scanner scanner = new Scanner(System.in);

  public static void main (String[] args){
    while (true) {
      System.out.println("\n --- CRUD MENU");
      System.out.println("1.Talaba qo'shish (Crate) ");
      System.out.println("2. Royhatni ko'rish");
      System.out.println("3. Ma'lumotni yangilash");
      System.out.println("4. Talabani o'chirish");
      System.out.println("5. Chiqish ");
      System.out.println("Tanlang");

      int tanlov = scanner.nextInt();
      if (tanlov == 5) break;

      switch (tanlov) {
        case 1: createStudent(); break;
        case 2 : readStudents(); break;
        case 3: updateStudent(); break;
        case 4: deleteStudent(); break;
      }

    }
  }

  // CREATE
    private static void createStudent() {
        System.out.print("ID: "); int id = scanner.nextInt();
        System.out.print("Ism: "); String name = scanner.next();
        students.add(new Student(id, name));
        System.out.println("Muvaffaqiyatli qo'shildi!");
    }


    // READ
    private static void readStudents() {
        if (students.isEmpty()) System.out.println("Ro'yxat bo'sh.");
        for (Student s : students) System.out.println(s);
    }


    // UPDATE
    private static void updateStudent() {
        System.out.print("Yangilash uchun ID kiriting: ");
        int id = scanner.nextInt();
        for (Student s : students) {
            if (s.getId() == id) {
                System.out.print("Yangi ism: ");
                s.setName(scanner.next());
                return;
            }
        }
        System.out.println("Talaba topilmadi.");
    }

    // DELETE
    private static void deleteStudent() {
        System.out.print("O'chirish uchun ID kiriting: ");
        int id = scanner.nextInt();
        students.removeIf(s -> s.getId() == id);
        System.out.println("Muvaffaqiyatli o'chirildi!");
    }

}
