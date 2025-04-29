package model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String designation;

    @ManyToOne
    @JoinColumn(name = "factory_id")
    private Factory factory;

//    // Getters and Setters
//    public Long getId(Long id) {
//        return this.id;
//    }
}
