package Package;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int secim = 1;

		SingleList liste = new SingleList();

		Scanner scan = new Scanner(System.in);

		while (secim != 0) {

			System.out.println();
			System.out.println("Öðrenci Kayýtlarý:");
			System.out.println("Yeni Kayýt - 1");
			System.out.println("Kayýt Sil - 2");
			System.out.println("Kayýtlarý Listele - 3");
			System.out.println("En Baþarýlý Öðrenci - 4");
			System.out.println("Çýkýþ - 0");

			secim = scan.nextInt();

			if (secim == 1) {
				liste.ekle();
			} else if (secim == 2) {
				liste.sil();
			} else if (secim == 3) {
				liste.yazdir();
			} else if (secim == 4) {
				liste.EnBasariliOgrenci();
			} else if (secim == 0) {
				System.out.println("Çýkýþ yapýldý.");

			} else
				System.out.println("Yanlýþ tuþlama yaptýnýz.");

		}

	}

}
