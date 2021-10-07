package pt.amane.bds03.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pt.amane.bds03.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
