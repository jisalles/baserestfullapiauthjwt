package br.com.baserestfullapiauthjwt.repository;

import br.com.baserestfullapiauthjwt.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Integer> {

}