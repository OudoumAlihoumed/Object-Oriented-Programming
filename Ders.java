package odev1;

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
