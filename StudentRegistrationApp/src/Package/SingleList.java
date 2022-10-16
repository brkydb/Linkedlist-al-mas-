package Package;
import java.util.Scanner;

public class SingleList {

	Node head = null;
	Node tail = null;
	Node temp = null;
	Node temp2 = null;

	int numara;
	String ad;
	String soyad;
	int vize;
	int finall;
	double ortalama;
	String durum;

	Scanner scan = new Scanner(System.in);

	void ekle() {

		System.out.println("Kay�t yap�lacak ��rencinin bilgilerini giriniz: ");
		System.out.println("Numara : ");
		numara = scan.nextInt();
		scan.nextLine();
		System.out.println("Ad : ");
		ad = scan.nextLine();
		System.out.println("Soyad : ");
		soyad = scan.nextLine();
		System.out.println("Vize : ");
		vize = scan.nextInt();
		System.out.println("Final : ");
		finall = scan.nextInt();

		Node eleman = new Node(numara, ad, soyad, vize, finall);

		if (head == null) {
			head = eleman;
			tail = eleman;
			System.out.println("�lk ��rencinin kay�d� yap�ld�.");
		} else {
			eleman.next = head;
			head = eleman;
			System.out.println(numara + " numaral� ��renci kay�t oldu.");

		}

	}

	void sil() {

		if (head == null) {
			System.out.println("Silinecek ��renci yok.");
		} else {
			System.out.println("Silinecek ��rencinin numaras�n� giriniz: ");
			numara = scan.nextInt();

			if (numara == head.numara && head.next == null) {

				head = null;
				tail = null;
				System.out.println(numara + " numaral� ��renci silindi.");

			} else if (numara == head.numara && head.next != null) {
				System.out.println(numara + " numaral� ��renci silindi.");
			}

			else {

				temp = head;

				while (temp.next != null) {

					temp2 = temp;
					temp = temp.next;
				}
				if (numara == temp.numara) {

					temp2.next = null;
					tail = temp2;
					System.out.println(numara + " numaral� ��renci silindi.");

				}
			}
		}

	}

	void yazdir() {

		if (head == null) {
			System.out.println("Kay�tl� ��renci yok.");
		} else {

			temp = head;
			while (temp != null) {

				System.out.println("###############################################");
				System.out.println(temp.numara + " numaral� ��renci bilgileri:");
				System.out.println("Ad        : " + temp.ad);
				System.out.println("Soyad     : " + temp.soyad);
				System.out.println("Vize      : " + temp.vize);
				System.out.println("Final     : " + temp.finall);
				System.out.println("Ortalama  : " + temp.ortalama);
				System.out.println("Durum     : " + temp.durum);
				System.out.println("###############################################");

				temp = temp.next;
			}
		}
	}

	void EnBasariliOgrenci() {

		if (head == null) {
			System.out.println("Kay�tl� ��renci yok.");
		} else {

			temp = head;
			double big = temp.ortalama;

			while (temp != null) {

				if (big < temp.ortalama) {

					big = temp.ortalama;

					numara = temp.numara;
					ad = temp.ad;
					soyad = temp.soyad;
					vize = temp.vize;
					finall = temp.finall;
					ortalama = temp.ortalama;
					durum = temp.durum;
				}

			}

			while (temp != null) {

				temp = temp.next;
			}

			System.out.println("###############################################");
			System.out.println("En ba�ar�l� ��rencinin bilgileri: ");
			System.out.println("Ad        : " + ad);
			System.out.println("Soyad     : " + soyad);
			System.out.println("Vize      : " + vize);
			System.out.println("Final     : " + finall);
			System.out.println("Ortalama  : " + ortalama);
			System.out.println("Durum     : " + durum);
			System.out.println("###############################################");

		}
	}

	}

