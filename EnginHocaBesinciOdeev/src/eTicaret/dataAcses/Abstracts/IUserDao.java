package eTicaret.dataAcses.Abstracts;

import eTicaret.Entitiet.Concrate.User;

public interface IUserDao {
void add(User user);
void delete(User user);
void update(User user);

}
