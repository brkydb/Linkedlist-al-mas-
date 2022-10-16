package Package;

public class Node {
	
	int numara;
	String ad;
	String soyad;
	int vize;
	int finall;
	double ortalama;
	String durum;
	
	Node next;

	public Node(int numara, String ad, String soyad, int vize, int finall) {
		super();
		this.numara = numara;
		this.ad = ad;
		this.soyad = soyad;
		this.vize = vize;
		this.finall = finall;
		
		ortalama = vize*0.4 + finall*0.6;
		

		if(ortalama >= 50) durum = "Geçti";
		else durum = "kaldý";
		
		next = null;
	}

	
	
	

}
