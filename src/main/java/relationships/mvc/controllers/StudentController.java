package relationships.mvc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import relationships.mvc.models.Dormitory;
import relationships.mvc.models.Student;
import relationships.mvc.services.DormitoryService;
import relationships.mvc.services.StudentService;



@Controller
public class StudentController {
	private final StudentService serv;
	private final DormitoryService dormServ;
	 
	 public StudentController(StudentService serv, DormitoryService dormServ) {
	     this.serv = serv;
	     this.dormServ = dormServ;
	     }

		 
	 
	 @RequestMapping("/students/new")
	 public String index() {
	     return "/students/new.jsp";

	 }
	 
	 @RequestMapping(value="/students/create")
	 public String create(@RequestParam(value="firstName") String firstName,
			 @RequestParam(value="lastName") String lastName,
			 @RequestParam(value="age") int age) {
	     
		 Student s = new Student (firstName, lastName, age);
		 serv.createStudent(s);
		 return "redirect:/dorms/new";
		 
		  
	 }
	 
	 @RequestMapping(value="/dorms/{id}/add")
	 public String create(@PathVariable (value="id") Long id,
			 @RequestParam(value="studentID") Long studentID) {
	     System.out.format("Student id %d", studentID);
		 Dormitory d = dormServ.findDormitory(id); 
		 Student s = serv.findStudent(studentID);
		 s.setDormitory(d);
		 serv.updateStudent(s);
		 return String.format("redirect:/dorms/%d",id);
		 
	 }
	 
	 @RequestMapping(value="/dorms/{id}/remove")
	 public String remove(@PathVariable (value="id") Long id,
			 @RequestParam(value="student") Long student) {
		 Student s = serv.findStudent(student);
		 s.setDormitory(null);
		 serv.updateStudent(s);
		 return String.format("redirect:/dorms/%d",id);
		 
	 }
	 

	 
}
