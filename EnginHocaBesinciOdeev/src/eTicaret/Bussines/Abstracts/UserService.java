package eTicaret.Bussines.Abstracts;

import java.util.List;

import eTicaret.Entitiet.Concrate.User;

public interface UserService {
	void add(User user);
	void delete(User user);
	void update(User user);
	
	
	List<User> getAll();


}
