import java.util.Scanner;

public class program {
  public static void main(String[] args) {
    System.out.print("=== EKSEKUSI ARITMATIKA === \n \n");
    System.out.print("***(ATURAN KABATAKU \n )");
    //()
    int hasil = 2*5+10;
    System.out.print(" Hasil untuk 2*5+10 = " + hasil + "\n");
    //pengeksekusian KABATAKU
     hasil = (2*5)+10;
    System.out.print(" Hasil untuk (2*5)+10 = " + hasil + "\n \n \n");
    //pengeksekusian kurung
    Scanner UserInput = new Scanner(System.in);
    int m,x,c;
    System.out.print("==== PERSAMAAM KUADRAT ====" + "\n \n");
    System.out.print("(01) Masukan nilai x =  ");
    x = UserInput.nextInt();
    System.out.print("(02) Masukan gradien m = ");
    m = UserInput.nextInt();
    System.out.print("(03) Masukan bias c = ");
    c = UserInput.nextInt();
    int y = (m*x*x)+c;
    System.out.print("NILAI Y = " + y);
    
    
  }
}
