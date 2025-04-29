package model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ProductionRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productName;
    private int quantity;
    private String productionDate;

    @ManyToOne
    @JoinColumn(name = "machine_id")
    private Machine machine;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
//
//    // Getters and Setters
//    public Long getId(Long id) {
//        return this.id;
//    }
}
