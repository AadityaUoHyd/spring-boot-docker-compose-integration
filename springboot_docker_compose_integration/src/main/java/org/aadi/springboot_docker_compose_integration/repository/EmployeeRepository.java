package org.aadi.springboot_docker_compose_integration.repository;

import org.aadi.springboot_docker_compose_integration.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
