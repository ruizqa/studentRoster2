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
public class DormitoryController {
	private final DormitoryService serv;
	private final StudentService studServ;

	
	
	 public DormitoryController(DormitoryService serv, StudentService studServ) {
	     this.serv = serv;
	     this.studServ = studServ;
	 }
	 
	 @RequestMapping("/dorms/new")
	 public String index(Model model) {
	     return "/dorm/new.jsp";
	 }
	 
	 @RequestMapping(value="/dorms/create")
	 public String create(@RequestParam(value="name") String name) {
	     
		 Dormitory d = new Dormitory(name);
		 serv.createDormitory(d);
		 Long id = d.getId();
		 return String.format("redirect:/dorms/%d",id);
		 
	 }
	 
	 @RequestMapping("/dorms/{id}")
	 public String getDorm(@PathVariable (value = "id") Long id, Model model) {
	     
		 Dormitory d = serv.findDormitory(id);
		 List<Student> students = studServ.allStudentsNotInDorm(); 
		 model.addAttribute("students",students);
		 model.addAttribute("dorm", d);
		 return "/dorm/show.jsp";
	 }
	 
	 
	 
	 
}
