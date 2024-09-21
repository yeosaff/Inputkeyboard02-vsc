import java.util.Scanner;

public class InputKeyboard02 {
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String nama, nim, ps;
    
    System.out.println("=========Input=========");
    System.out.print("Nama:  ");
    nama = in.nextLine();

    System.out.print("NIM: ");
    nim = in.nextLine();

    System.out.print("Program Studi: ");
    ps = in.nextLine();

    System.out.println();
    System.out.println("=========Output=========");
    System.out.println("Hi " + nama + ", " + "Anda terdaftar dengan NIM: " + nim + " di Program Studi " + ps + "." );
    









    
    
    


   } 
}
