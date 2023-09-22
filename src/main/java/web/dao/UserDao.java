package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import java.util.List;


@Repository
public interface UserDao {
    void add(User user);

    List<User> listUsers();
}
