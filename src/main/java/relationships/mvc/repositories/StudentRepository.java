package relationships.mvc.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import relationships.mvc.models.Student;



@Repository

public interface StudentRepository extends CrudRepository<Student, Long>{
    
    List<Student> findAll();
    Optional<Student> findById(Long id);
    List<Student> findByDormitory_idIsNull();
    

}
