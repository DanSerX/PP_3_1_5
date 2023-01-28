package spring_b_s_rest.service;

import org.springframework.stereotype.Service;
import spring_b_s_rest.model.Role;
import spring_b_s_rest.dao.RoleDao;

import java.util.HashSet;
import java.util.Set;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleDao roleDao;

    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public void createRoles(Set<Role> roles) {
        roleDao.saveAll(roles);
    }

    @Override
    public Set<Role> getAllRoles() {
        Iterable<Role> iterable = roleDao.findAll();
        Set<Role> set = new HashSet<>();
        iterable.forEach(set::add);
        return set;
    }

}
