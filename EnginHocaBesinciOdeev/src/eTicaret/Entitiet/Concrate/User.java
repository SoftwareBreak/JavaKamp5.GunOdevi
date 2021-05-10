package eTicaret.Entitiet.Concrate;


import eTicaret.Entitiet.Abstarts.IEntity;

public class User implements IEntity{

	private int id;
	private String isim;
	private String soyIsim;
	private String gmail;
	private double sifre;
	public User () {
		
	}
	
	public User(int id, String isim, String soyIsim, String gmail, double sifre) {
		super();
		this.id = id;
		this.isim = isim;
		this.soyIsim = soyIsim;
		this.gmail = gmail;
		this.sifre = sifre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyIsim() {
		return soyIsim;
	}

	public void setSoyIsim(String soyIsim) {
		this.soyIsim = soyIsim;
	}

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	public double getSifre() {
		return sifre;
	}

	public void setSifre(double sifre) {
		this.sifre = sifre;
	};
	
}
