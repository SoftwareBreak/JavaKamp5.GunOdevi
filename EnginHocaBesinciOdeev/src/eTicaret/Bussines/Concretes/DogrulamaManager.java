package eTicaret.Bussines.Concretes;

import eTicaret.Bussines.Abstracts.DogrulamaService;

public class DogrulamaManager implements DogrulamaService{

	@Override
	public void message() {
System.out.println("Mesaj gönderildi");		
	}

	@Override
	public void tiklama() {
System.out.println("Týkladýnýz");		
	}

}
