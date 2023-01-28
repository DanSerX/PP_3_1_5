package spring_b_s_rest.dao;

import org.springframework.data.repository.CrudRepository;
import spring_b_s_rest.model.User;

public interface UserDao extends CrudRepository<User, Long> {

    User findByName(String name);
    User findByEmail(String email);

}
