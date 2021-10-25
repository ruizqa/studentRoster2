package relationships.mvc.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="dormitories")
public class Dormitory {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy="dormitory", fetch = FetchType.LAZY)
    private List<Student> students;
    
    public Dormitory () {}
    
    public Dormitory (String name) {
    	this.name = name;	
    }
    
    public Dormitory (Long id, String name, List<Student> students) {
    	this.name = name;
    	this.id = id;
    	this.students = students;
    }
    
    public Dormitory (String name, List<Student> students) {
    	this.name = name;
    	this.students = students;
    }
      
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
    
    
    
    
}
