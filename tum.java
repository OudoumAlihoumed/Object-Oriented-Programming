package odev1;

public class tum {
	
	
	public class Ogrenci {
		private int bolNo;
		private int ogrID;
		private String ogrAd;
		private String ogrSoyad;
		private int ogrSinif;
		static int syc=0;
		public Ogrenci(int bolNo, String ogrAd, String ogrSoyad, int ogrSinif) {
			super();
			this.bolNo = bolNo;
			this.ogrAd = ogrAd;
			this.ogrSoyad = ogrSoyad;
			this.ogrSinif = ogrSinif;
			this.ogrID=syc++;
		}
		public int getBolNo() {
			return bolNo;
		}
		public void setBolNo(int bolNo) {
			this.bolNo = bolNo;
		}
		public int getOgrID() {
			return ogrID;
		}
		public void setOgrID(int ogrID) {
			this.ogrID = ogrID;
		}
		public String getOgrAd() {
			return ogrAd;
		}
		public void setOgrAd(String ogrAd) {
			this.ogrAd = ogrAd;
		}
		public String getOgrSoyad() {
			return ogrSoyad;
		}
		public void setOgrSoyad(String ogrSoyad) {
			this.ogrSoyad = ogrSoyad;
		}
		public int getOgrSinif() {
			return ogrSinif;
		}
		public void setOgrSinif(int ogrSinif) {
			this.ogrSinif = ogrSinif;
		}
	}
	public class Ders {
		
		private int bolNo;
		private int dersKredi;
		private String dersAd;
		private int dersId;
		 static int syc=0;
		
		public Ders(int bolNo, int dersKredi, String dersAd) {
			super();
			this.bolNo = bolNo;
			this.dersKredi = dersKredi;
			this.dersAd = dersAd;
			this.dersId = syc++;
		}
		public int getBolNo() {
			return bolNo;
		}
		public void setBolNo(int bolNo) {
			this.bolNo = bolNo;
		}
		public int getDersKredi() {
			return dersKredi;
		}
		public void setDersKredi(int dersKredi) {
			this.dersKredi = dersKredi;
		}
		public String getDersAd() {
			return dersAd;
		}
		public void setDersAd(String dersAd) {
			this.dersAd = dersAd;
		}
		public int getDersId() {
			return dersId;
		}
		public void setDersId(int dersId) {
			this.dersId = dersId;
		}
	}
	
	public class Bolum {
		private int bolNo;
		private String bolAd;
		public Ogrenci[] ogrenciler;
		public Ders[]  dersler;
		public Bolum(int bolNo, String bolAd) {
			super();
			this.bolNo = bolNo;
			this.bolAd = bolAd;
		}
		public int getBolNo() {
			return bolNo;
		}
		public void setBolNo(int bolNo) {
			this.bolNo = bolNo;
		}
		public String getBolAd() {
			return bolAd;
		}
		public void setBolAd(String bolAd) {
			this.bolAd = bolAd;
		}    
	}
	
	
	import java.util.Scanner;

	public class Anasayfa {

		public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);

			System.out.println("Bolum adeti giriniz: ");
			int bolum_adet = scanner.nextInt();

			Bolum[] bolumlar = new Bolum[bolum_adet];

			for (int i = 0; i < bolum_adet; i++) {
				System.out.print((i+1)+".Bolum  numara giriniz: ");
				int bolNo = scanner.nextInt();
				
				scanner.nextLine();
				System.out.print((i+1)+".Bolum Adi giriniz: ");
				String bolAd = scanner.nextLine();
				
				System.out.print("Ogrenci adeti giriniz: ");
				int prev_ogrenciler = scanner.nextInt();

				System.out.print("ders adeti giriniz: ");
				int prev_dersler = scanner.nextInt();

				bolumlar[i] = new Bolum(bolNo, bolAd);
				bolumlar[i].dersler = new Ders[prev_dersler];
				bolumlar[i].ogrenciler = new Ogrenci[prev_ogrenciler];

				for (int j = 0; j < prev_ogrenciler; j++) {
					System.out.print((j+1)+".Ogrenci Adi giriniz:");
				     String  ogrlAd= scanner.next();
					
					System.out.print((j+1)+".Ogrenci Soyad giriniz:");
					String ogrlSoyad = scanner.next();

					System.out.print((j+1)+".Ogrenci sinifin numara giriniz:");
					int ogrSinif = scanner.nextInt();

					bolumlar[i].ogrenciler[j] = new Ogrenci(bolNo, ogrlAd, ogrlSoyad, ogrSinif);
				}
	               
				for (int j = 0; j < prev_dersler; j++) {
					scanner.nextLine();
					System.out.print((j+1)+".Ders Adi giriniz:");
					String dersAd = scanner.nextLine();

					System.out.print((j+1)+".Ders kredi giriniz:");
					int derskredi = scanner.nextInt();

					bolumlar[i].dersler[j] = new Ders(bolNo, derskredi, dersAd);
	 			}
			}

			int secim;
			boolean kontrol = true;

			while (kontrol) {

				System.out.println("----------------Menu-------------------------");
				System.out.println("1.Tüm bölümlerin bilgileri listele");
				System.out.println("2.Bölüm adına göre Arama yap");
				System.out.println("3.Öğrenci adına göre Arama yap");
				System.out.println("4.Ders adına göre Arama yap");
				System.out.println("5.Sınıf bilgisine göre Arama yap ");
				System.out.println("6.Ders kredisine göre dersleri bul");
				System.out.println("7.Çıkış");
				System.out.println("-----------------------------------------");
				secim = scanner.nextInt();
				System.out.println("-----------------------------------------");
				switch (secim) {
				case 1:
					
				
					for (Bolum bolum : bolumlar) {
						System.out.print("Bolum No:"+bolum.getBolNo() +" "+ " Bolum Adi:" + bolum.getBolAd());
						
						System.out.print("\nOgrenciler:\n");
						for (int i = 0; i < bolum.ogrenciler.length; i++) {
							System.out.print((i + 1)+".Ogrenci: "+" "+bolum.ogrenciler[i].getOgrID() 
									+" "+ bolum.ogrenciler[i].getOgrAd() +" "+bolum.ogrenciler[i].getOgrSoyad() 
									+" "+ bolum.ogrenciler[i].getOgrSinif()+"\n");
						}
						
						
						System.out.print("\nDersler:\n");
						for (int j = 0; j < bolum.dersler.length; j++) {

							System.out.print((j + 1) + ".Ders:"+ bolum.dersler[j].getDersId() 
									+" "+ bolum.dersler[j].getDersAd()+" "+bolum.dersler[j].getDersKredi()+"\n");
						}
						
					}

					break;
					
				case 2:
					scanner.nextLine();
					System.out.println("Aranacak bolum adina giriniz:");
					String aranan = scanner.nextLine();
					int syc = -1;

					for ( int i = 0; i < bolumlar.length; i++) {
						if (aranan.equals(bolumlar[i].getBolAd())) {
							syc =i;
							
							System.out.print("Bolum NO:" + bolumlar[i].getBolNo() +""+ "Bolum adi:" + bolumlar[i].getBolAd());
							System.out.println("\nOgrenciler:\n");
							for (int j = 0; j < bolumlar[i].ogrenciler.length; j++) {
								System.out.print((j + 1) + ".Ogrenci:" + bolumlar[i].ogrenciler[j].getOgrID() + " "
										+ bolumlar[i].ogrenciler[j].getOgrAd() + " "
										+ bolumlar[i].ogrenciler[j].getOgrSoyad() + " "
										+ bolumlar[i].ogrenciler[j].getOgrSinif()+"\n");
							}
							System.out.println("\nDersler\n");
							for (int j = 0; j < bolumlar[i].dersler.length; j++) {
								System.out.print((j + 1) + ".Ders:" + bolumlar[i].dersler[j].getDersId() + " "
										+ bolumlar[i].dersler[j].getDersAd() + " " + bolumlar[i].dersler[j].getDersKredi()+"\n");
							}

						}

					}

					if (syc == -1) {
						System.out.print("Aranan Bolum adi bulunmadi");
					}
					break;

				case 3:
					scanner.nextLine();
					System.out.println("Aranacak Ogrenci  adina giriniz:");
					String ara = scanner.nextLine();
					int syc1 = -1;
					for (Bolum ogr : bolumlar) {
						for ( int i = 0; i< ogr.ogrenciler.length; i++) {
							if (ara.equals(ogr.ogrenciler[i].getOgrAd()) ) {
								syc1=i;
								System.out.print((i + 1) + ".Ogrenci:" + ogr.ogrenciler[i].getOgrID() + " "
										+ ogr.ogrenciler[i].getOgrAd() + " " + ogr.ogrenciler[i].getOgrSoyad() + " "
										+ ogr.ogrenciler[i].getOgrSinif()+"\n");
							}
						}
					}

					if (syc1 == -1) {
						System.out.print("Aranan Ogrenci adi bulunmadi");
					}
					break;
				case 4:
					   scanner.nextLine();
					System.out.print("Aranacak Ders  adina giriniz:");
					String aranacak = scanner.nextLine();
					int syc2 = -1;
					for (Bolum der : bolumlar) {
						for ( int i= 0; i < der.dersler.length; i++) {
							if (aranacak.equals(der.dersler[i].getDersAd())) {
								syc2=i;
								System.out.println((i + 1) + ".Ders:" + der.dersler[i].getDersId() + " "
										+ der.dersler[i].getDersAd() + " " + der.dersler[i].getDersKredi()+"\n");
							}
						}
					}
					if (syc2 == -1) {
						System.out.print("Aranan ders adi bulunmadi");
					}
					break;

				case 5:
					System.out.print("Aranacak sinif bilgileri giriniz:");
					int aran = scanner.nextInt();
					int syc3 = -1;

					for (Bolum sinif : bolumlar) {
						for ( int i = 0; i < sinif.ogrenciler.length; i++) {
							if (aran == sinif.ogrenciler[i].getOgrSinif()) {
								syc3=i;
								System.out.println((i+ 1) + ".Ogrenci: " + sinif.ogrenciler[i].getOgrID() +" "
										+ sinif.ogrenciler[i].getOgrAd() +" "+ sinif.ogrenciler[i].getOgrSoyad() + " "
										+ sinif.ogrenciler[i].getOgrSinif()+"\n");
							}
						}
					}
					if (syc3 == -1) {
						System.out.println("Aranan sinif ogrenci adi bulunmadi");
					}
					break;

				case 6:
					System.out.println("Aranacak Ders  kredisi giriniz:");
					int Ara = scanner.nextInt();
					int syc5 = -1;
					for (Bolum kredi : bolumlar) {
						for ( int i = 0; i< kredi.dersler.length; i++) {
							if (Ara == kredi.dersler[i].getDersKredi()) {
								syc5=i;
								System.out.println((i + 1) + ".Ders:" + kredi.dersler[i].getDersId() + " "
										+ kredi.dersler[i].getDersAd() + " " + kredi.dersler[i].getDersKredi()+"\n");
							}
						}
					}
					if (syc5 == -1) {
						System.out.println("Aranan kredisine sahip ogrenci bulunmadi");
					}
					break;
				case 7:
					kontrol = false;
					break;

				default:
					System.out.println("1-7 arasinda degerleri seciniz..");

				}

			}
		}
	
}
