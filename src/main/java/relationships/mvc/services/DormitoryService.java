package relationships.mvc.services;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import relationships.mvc.models.Dormitory;
import relationships.mvc.models.Student;
import relationships.mvc.repositories.DormitoryRepository;

@Service 
public class DormitoryService {
private final DormitoryRepository repo;

    public DormitoryService(DormitoryRepository repo) {
        this.repo = repo;
    }
 
    public List<Dormitory> all() {
        return repo.findAll();
    }
    
    public Dormitory createDormitory(Dormitory d) {
        return repo.save(d);
    }
    
    public Dormitory findDormitory(Long id) {
        Optional<Dormitory> opDorm = repo.findById(id);
        if(opDorm.isPresent()) {
            return opDorm.get();
        } else {
            return null;
        }
    }
    
    public Dormitory updateDormitory(Long id, String name, List<Student> students) {    	
    	Dormitory CI = new Dormitory (id,name, students);
        return repo.save(CI);
    }
    
  

    public void deleteDormitory (Long id) {
        Optional<Dormitory> dorm = repo.findById(id);
        if(dorm.isPresent()) {
            repo.deleteById(id);
        } 
    }
    
    
}
