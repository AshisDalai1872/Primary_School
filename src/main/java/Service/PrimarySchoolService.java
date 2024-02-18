package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Entity.PrimarySchool;
import Repository.PrimaryRepository;

@Service
public class PrimarySchoolService {

	@Autowired
	public PrimaryRepository primaryRepository;
	
	
	public List<PrimarySchool> findAllSchool(){
		
		return primaryRepository.findAll();
	}
	public String addPrimarySchool(PrimarySchool primaryschool)
	{
		 primaryRepository.save(primaryschool);
		 return "school added";
	}
		 
	}

