package com.employee.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.employee.demo.model.ERole;
import com.employee.demo.model.Role;

/**
 * RoleRepository to implement the CRUD operation on Role entity
 * @return entity
 * @author Manoj
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}
