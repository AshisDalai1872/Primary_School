package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import Entity.PrimarySchool;
import Service.PrimarySchoolService;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
public class PrimarySchoolController {
	
	@Autowired
	public PrimarySchoolService primaryService;
	
	@GetMapping("/Home")
	public String Home() {
		
		return "welcome to homepage Ashis dalai bangalore";
	}
	
	@PostMapping("/addSchool")
	public String saveNewSchool(@RequestBody PrimarySchool primarySchool)
	{
	    primaryService.addPrimarySchool(primarySchool);
	return "school added ";

	}
}

