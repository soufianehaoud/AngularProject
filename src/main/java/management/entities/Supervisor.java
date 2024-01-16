package management.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Supervisor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSupervisor;
    @NotNull
    //@Size(min = 3, max = 20)
    private String nameSupervisor;

    private Double salarySupervisor;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    //@PastOrPresent
    private Date dateRecrut;
    @OneToMany(mappedBy = "supervisor")
    @JsonIgnore
    private List<Trainee> trainees;

   
}
