package DouglasGuacaran.Eva_Int_Mod_7.repository;

import DouglasGuacaran.Eva_Int_Mod_7.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(String roleName);
}
