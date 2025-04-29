package model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Machine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String machineName;
    private String type;
    private String purchaseDate;

    @ManyToOne
    @JoinColumn(name = "factory_id")
    private Factory factory;



//    // Getters and Setters
//    public Long getId(Long id) {
//        return this.id;
//    }
}
