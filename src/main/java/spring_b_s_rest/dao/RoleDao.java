package spring_b_s_rest.dao;


import org.springframework.data.repository.CrudRepository;
import spring_b_s_rest.model.Role;

public interface RoleDao extends CrudRepository<Role, Long> {
}
