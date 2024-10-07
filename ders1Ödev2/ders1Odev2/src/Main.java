import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentYear = LocalDate.now().getYear();

        System.out.println(currentYear);

        System.out.println("Adınızı ve Soyadınızı giriniz :");
        String adSoyad = scanner.nextLine();
        adSoyad = adSoyad.toUpperCase();

        System.out.println("Yaşınızı giriniz :");
        int yas = scanner.nextInt();

        int dogumYılı = currentYear - yas;

        System.out.printf(adSoyad+","+dogumYılı+" yılında doğmuştur.");

    }
}