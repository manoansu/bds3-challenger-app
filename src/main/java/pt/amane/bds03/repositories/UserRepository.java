package pt.amane.bds03.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pt.amane.bds03.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);

}
