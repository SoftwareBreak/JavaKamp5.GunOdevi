package eTicaret.dataAcses.Concrete;

import eTicaret.Entitiet.Concrate.User;
import eTicaret.dataAcses.Abstracts.IUserDao;

public class HiberNateDao implements IUserDao{

	@Override
	public void add(User user) {
System.out.println("Hibernate �le Eklendi :"+user.getIsim());		
	}

	@Override
	public void delete(User user) {
		System.out.println("Hibernate �le Silindi :"+user.getIsim());		
		
	}

	@Override
	public void update(User user) {
		System.out.println("Hibernate �le G�ncellendi :"+user.getIsim());		
		
	}
	
	

}
