package Package;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int secim = 1;

		SingleList liste = new SingleList();

		Scanner scan = new Scanner(System.in);

		while (secim != 0) {

			System.out.println();
			System.out.println("��renci Kay�tlar�:");
			System.out.println("Yeni Kay�t - 1");
			System.out.println("Kay�t Sil - 2");
			System.out.println("Kay�tlar� Listele - 3");
			System.out.println("En Ba�ar�l� ��renci - 4");
			System.out.println("��k�� - 0");

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
				System.out.println("��k�� yap�ld�.");

			} else
				System.out.println("Yanl�� tu�lama yapt�n�z.");

		}

	}

}
