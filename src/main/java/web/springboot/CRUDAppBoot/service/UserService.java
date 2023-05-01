package web.springboot.CRUDAppBoot.service;



import web.springboot.CRUDAppBoot.model.User;

import java.util.List;

public interface UserService {

    List<User> getUsers();

    User getUserById(int id);

    void addUser(User user);

    User updateUser(int id, User updatedUser);

    void deleteUser(int id);
}