package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CvForProgrammingSkillsService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CvForProgrammingSkills;

@RestController
@RequestMapping("/api/programmingSkills")
public class ProgrammingSkillsController {
	
	private CvForProgrammingSkillsService cvForProgrammingSkillsService;

	@Autowired
	public ProgrammingSkillsController(CvForProgrammingSkillsService cvForProgrammingSkillsService) {
		super();
		this.cvForProgrammingSkillsService = cvForProgrammingSkillsService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CvForProgrammingSkills cvForProgrammingSkills){
		return this.cvForProgrammingSkillsService.add(cvForProgrammingSkills);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody CvForProgrammingSkills cvForProgrammingSkills){
		return this.cvForProgrammingSkillsService.update(cvForProgrammingSkills);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id){
		return this.cvForProgrammingSkillsService.delete(id);
	}
	
	@GetMapping("/getbyid")
	public DataResult<CvForProgrammingSkills> getById(@RequestParam("id") int id){
		return this.cvForProgrammingSkillsService.getById(id);
	}
	
	@GetMapping("/getall")
	public DataResult<List<CvForProgrammingSkills>> getAll(){
		return this.cvForProgrammingSkillsService.getAll();
	}
	
	@GetMapping("/getAllByJobseekerId")
	public DataResult<List<CvForProgrammingSkills>> getAllByJobseekerId(@RequestParam int id){
		return this.cvForProgrammingSkillsService.getAllByJobseekerId(id);
	}
}