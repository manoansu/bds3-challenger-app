package pt.amane.bds03.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pt.amane.bds03.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
