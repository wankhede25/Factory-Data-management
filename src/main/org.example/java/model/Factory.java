package model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Factory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String location;
    private String establishedDate;

    @OneToMany(mappedBy = "factory")
    private List<Employee> employees;

    @OneToMany(mappedBy = "factory")
    private List<Machine> machines;

    // Getters and Setters
}
