package eTicaret.dataAcses.Concrete;

import eTicaret.Entitiet.Concrate.User;
import eTicaret.dataAcses.Abstracts.IUserDao;

public class HiberNateDao implements IUserDao{

	@Override
	public void add(User user) {
System.out.println("Hibernate Ýle Eklendi :"+user.getIsim());		
	}

	@Override
	public void delete(User user) {
		System.out.println("Hibernate Ýle Silindi :"+user.getIsim());		
		
	}

	@Override
	public void update(User user) {
		System.out.println("Hibernate Ýle Güncellendi :"+user.getIsim());		
		
	}
	
	

}
