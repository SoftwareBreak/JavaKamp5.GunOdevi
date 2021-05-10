package eTicaret.Bussines.Abstracts;

import eTicaret.Entitiet.Concrate.User;

public interface AuthService {
void login(User user, UserService userService);

}
