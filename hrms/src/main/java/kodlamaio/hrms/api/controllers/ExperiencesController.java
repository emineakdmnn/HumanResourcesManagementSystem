package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CvForExperienceService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CvForExperience;

@RestController
@RequestMapping("/api/experiences")
public class ExperiencesController {
	
	private CvForExperienceService cvForExperienceService;

	@Autowired
	public ExperiencesController(CvForExperienceService cvForExperienceService) {
		super();
		this.cvForExperienceService = cvForExperienceService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CvForExperience cvForExperience){
		return this.cvForExperienceService.add(cvForExperience);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody CvForExperience cvForExperience){
		return this.cvForExperienceService.update(cvForExperience);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id){
		return this.cvForExperienceService.delete(id);
	}
	
	@GetMapping("/getbyid")
	public DataResult<CvForExperience> getById(@RequestParam int id){
		return this.cvForExperienceService.getById(id);
	}
	
	@GetMapping("/getall")
	public DataResult<List<CvForExperience>> getAll(){
		return this.cvForExperienceService.getAll();
	}
	
	@GetMapping("/getAllByJobseekerIdOrderByEndAtDesc")
	public DataResult<List<CvForExperience>> getAllByJobseekerIdOrderByEndAtDesc(@RequestParam("id") int id){
		return this.cvForExperienceService.getAllByJobseekerIdOrderByEndAtDesc(id);
	}
	
	@GetMapping("/getAllByJobseekerId")
	public DataResult<List<CvForExperience>> getAllByJobseekerId(@RequestParam int id){
		return this.cvForExperienceService.getAllByJobseekerId(id);
	}
}