package eTicaret;

import eTicaret.Bussines.Abstracts.AuthService;
import eTicaret.Bussines.Abstracts.UserService;
import eTicaret.Bussines.Concretes.AuthManager;
import eTicaret.Bussines.Concretes.DogrulamaManager;
import eTicaret.Bussines.Concretes.UserManager;
import eTicaret.Core.Conctates.RegisterManagerAdapter;
import eTicaret.Entitiet.Concrate.User;
import eTicaret.dataAcses.Concrete.HiberNateDao;

public class Main {

	public static void main(String[] args) {

		UserService userService = new UserManager(new HiberNateDao(), new RegisterManagerAdapter(), new DogrulamaManager());
		AuthService authService = new AuthManager();
		
		
 User user1 = new User();
 user1.setId(1);
 user1.setIsim("Fatih");
 user1.setSoyIsim("Taþkesen");
 user1.setGmail("27fatih16@gamil.com");
 user1.setSifre(5555555);
 
 
 
 userService.add(user1);
 authService.login(user1, userService);
	}

}
