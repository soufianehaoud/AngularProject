package management.restcontrollers;

import management.entities.Trainee;
import management.services.TraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class TraineeRestController {
    @Autowired
    TraineeService traineeService;
    @GetMapping("/trainees")
    List<Trainee> getAllTrainees(){
        return traineeService.getAllTrainees();
    }

    @GetMapping("/trainees/{idTrainee}")
    public Trainee getTraineeById(@PathVariable("idTrainee") Long idTrainee){
        return traineeService.getTraineeById(idTrainee);
    }
    @GetMapping("/trainees/Department/{idDepartment}")
    public List<Trainee> getAllTraineesByDepartment(@PathVariable("idDepartment") Long idDepartment){
        return traineeService.findAllTraineesByIdDepartment(idDepartment);
    }
    @GetMapping("/trainees/Supervisor/{idSupervisor}")
    public List<Trainee> getAllTraineesBySupervisor(@PathVariable("idSupervisor") Long idSupervisor){
        return traineeService.findAllTraineesByIdSupervisor(idSupervisor);
    }
    @PostMapping("/trainees/save")
    public Trainee createTrainee(@RequestBody Trainee trainee){
        return traineeService.saveTrainee(trainee);
    }
    @PutMapping("/trainees/update")
    public Trainee updateTrainee(@RequestBody Trainee trainee){
        return traineeService.updateTrainee(trainee);
    }
    @DeleteMapping("/trainees/{idTrainee}")
    public void deleteTraineeById(@PathVariable("idTrainee") Long idTrainee){
        traineeService.deleteTraineeById(idTrainee);
    }

}
