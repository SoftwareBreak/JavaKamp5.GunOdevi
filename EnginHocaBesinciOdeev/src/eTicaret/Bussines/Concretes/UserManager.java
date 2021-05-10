package eTicaret.Bussines.Concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eTicaret.Bussines.Abstracts.DogrulamaService;
import eTicaret.Bussines.Abstracts.UserService;
import eTicaret.Core.Abstarts.typeOfRegister;
import eTicaret.Entitiet.Concrate.User;
import eTicaret.dataAcses.Abstracts.IUserDao;

public class UserManager implements UserService{
	
	private DogrulamaService DogrulamaService;
	private IUserDao IUserDao;
	private typeOfRegister tOR;
    private List<User> users = new ArrayList<User>(); 
    
	

	public UserManager(	IUserDao iUserDao,typeOfRegister tOR, DogrulamaService dogrulamaService) {
		
		DogrulamaService = dogrulamaService;
		IUserDao = iUserDao;
		this.tOR = tOR;
	}

	private String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
	Pattern pattern = Pattern.compile(regex);	
	@Override
	
	
	public void add(User user) {
    
		Matcher matcher = pattern.matcher(user.getGmail());
		if(users.isEmpty()) {				
			
			if(matcher.matches()) {
				if(user.getSifre() <= 999 ) {
					System.out.println("Kayit Yapilamadi- Þifre En Az 6 Haneli Olmalý");
				}
				else {
					if(user.getIsim().length() <= 2 || user.getSoyIsim().length() <= 2) {
						System.out.println("Kayit Yapilamadi- Ýsim/Soyisim En Az 2 Haneli Olmalý");
					}
					else {
						DogrulamaService.message();
						DogrulamaService.tiklama();
						System.out.println("Baþarýlý Bir Þekilde Eklendi");
						users.add(user);
					    IUserDao.add(user);
						
					}
					
				}					
				
			}
			else {
				System.out.println("Hatalý Bir Girdi Yapildi Eklenmedi");
			}				
		}
		else{
			for (User user_ : users) {
				if(user_.getGmail()==user.getGmail()) {						
					System.out.println("Kayitli- Ekleme Yapýlamadý");
					break;
				}
				else {						
					if(matcher.matches()) {
						if(user.getSifre() <= 999 ) {
							System.out.println("Kayit Yapilamadi- Þifre En Az 6 Haneli Olmalý");
						}
						else {
							if(user.getIsim().length() <= 2 || user.getSoyIsim().length() <= 2) {
								System.out.println("Kayit Yapilamadi- Ýsim/Soyisim En Az 2 Haneli Olmalý");
							}
							else {
								DogrulamaService.message();
								DogrulamaService.tiklama();									
								System.out.println("Baþarýlý Bir Þekilde Eklendi");
								users.add(user);
								tOR.register(user);
								break;
							}
							
						}
						
					}
					else {
						System.out.println("Eklenmedi");
						break;
					}
				}
			}				
		}
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return users;
	}

}
