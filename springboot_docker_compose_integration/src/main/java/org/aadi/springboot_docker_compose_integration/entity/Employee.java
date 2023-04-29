package org.aadi.springboot_docker_compose_integration.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "employee")
@Table(name = "employee")
public class Employee {

    @Id
    private int id;
    private String name;

}
