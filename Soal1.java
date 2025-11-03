import java.util.Scanner;
public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilangan;
        long faktorial = 1;

        System.out.println("Program Menghitung Faktorial");
        System.out.println("==========================");
        System.out.print("Masukkan Bilangan bulat positif : ");
        bilangan = input.nextInt();

        if (bilangan < 0) {
            System.out.println("Maaf bilangan yang masukkan negatif");
        } else {
            for (int i = 1; i <= bilangan; i++) {
                faktorial *= i;
            }
            System.out.println("Faktorial dari " + bilangan + " adalah : " + faktorial);
        }

        input.close();
    }
}
