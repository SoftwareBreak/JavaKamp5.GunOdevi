package eTicaret.Bussines.Concretes;



import java.util.List;

import eTicaret.Bussines.Abstracts.AuthService;
import eTicaret.Bussines.Abstracts.UserService;
import eTicaret.Entitiet.Concrate.User;

public class AuthManager implements AuthService{

	private List<User> liste;
    private UserService userService;

    public AuthManager() {

    }

    @Override
    public void login(User user,UserService userService) {
    	this.liste = userService.getAll();

        for (User user_ : liste) {
            if(user.getGmail() != user.getGmail() || user_.getSifre() != user.getSifre()) {
                System.out.println("Giriþ Baþarýsýz");
                break;
            }
            else {
                System.out.println("Giriþ Baþarýlý");
                break;
            }
        }
        
}
}
