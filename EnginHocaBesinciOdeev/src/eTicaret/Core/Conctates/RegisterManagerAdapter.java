package eTicaret.Core.Conctates;

import eTicaret.Core.Abstarts.typeOfRegister;
import eTicaret.Entitiet.Concrate.User;
import eTicaret.Google.Abstracts.IGoogle;
import eTicaret.Google.Concrates.GoogleManager;

public class RegisterManagerAdapter implements typeOfRegister{

	@Override
	public void register(User user) {
    IGoogle Igoogle =new GoogleManager();	
    Igoogle.add(user);
	}

}
