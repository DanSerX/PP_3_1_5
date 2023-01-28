package spring_b_s_rest.configs;

import org.springframework.stereotype.Component;
import spring_b_s_rest.model.Role;
import spring_b_s_rest.model.User;
import spring_b_s_rest.service.RoleService;
import spring_b_s_rest.service.UserService;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@Component
public class Initializer {

    private UserService userService;
    private RoleService roleService;

    public Initializer(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @PostConstruct
    public void Init() {
        Set<Role> allRoles = new HashSet<>();
        allRoles.add(new Role("ADMIN"));
        allRoles.add(new Role("USER"));
        roleService.createRoles(allRoles);
        User admin = new User("admin", "admin", 33, "333-33-33", "admin@admin.com", "admin");
        admin.setRoles("ADMIN, USER");
        userService.createUser(admin);
        User user = new User("user", "user", 33, "111-11-11", "user@user.com", "user");
        user.setRoles("USER");
        userService.createUser(user);
    }
}
