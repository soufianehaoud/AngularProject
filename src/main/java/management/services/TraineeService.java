package management.services;

import management.entities.Department;
import management.entities.Trainee;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TraineeService {
    Trainee saveTrainee(Trainee Trainee);
    Trainee updateTrainee(Trainee Trainee);
    Trainee getTraineeById(Long id);
    List<Trainee> getAllTrainees();
    void deleteTraineeById(Long id);
    void deleteAllTrainees();

    List<Trainee> findAllTraineesByPrice(double priceTrainee);
    List<Trainee> findAllTraineesByNamePrice(@Param("nameTrainee") String nameTrainee , @Param("priceTrainee") double priceTrainee);
    List<Trainee> findAllTraineesByDepartment(Department Department);

    List<Trainee> findAllTraineesByIdDepartment(Long idDepartment);
    List<Trainee> findAllTraineesByIdSupervisor(Long idSupervisor);
    List<Trainee> findAllTraineesByNameSort();

    Page<Trainee> getAllTraineesByPage(int page, int size);
    List<Trainee> findBySupervisorIdSupervisor(Long idSupervisor);
}
