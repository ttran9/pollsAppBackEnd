package tran.example.pollsbe.db;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;
import tran.example.pollsbe.model.Role;
import tran.example.pollsbe.model.RoleName;
import tran.example.pollsbe.repository.RoleRepository;

@Component
@ConditionalOnProperty(name = "pollsbe.roles.populate", havingValue = "true")
public class Seed implements CommandLineRunner {
    private RoleRepository roleRepository;

    public Seed(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public void run(String... args) {
        // Remove all existing roles
        this.roleRepository.deleteAll();

        // Save the "user role"
        Role user = new Role(RoleName.ROLE_USER);
        roleRepository.save(user);

        // Save the "admin role"
        Role admin = new Role(RoleName.ROLE_ADMIN);
        roleRepository.save(admin);

        System.out.println("Initialized user and admin roles");
    }
}
