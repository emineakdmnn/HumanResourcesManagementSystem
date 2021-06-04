package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CvForSchoolService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result; 
import kodlamaio.hrms.entities.concretes.CvForSchool;

@RestController
@RequestMapping("/api/schools")
public class SchoolController {

	private CvForSchoolService cvForSchoolService;

	@Autowired
	public SchoolController(CvForSchoolService cvForSchoolService) {
		super();
		this.cvForSchoolService = cvForSchoolService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CvForSchool cvForSchool){
		return this.cvForSchoolService.add(cvForSchool);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody CvForSchool cvForSchool){
		return this.cvForSchoolService.update(cvForSchool);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam int id){
		return this.cvForSchoolService.delete(id);
	}
	
	@GetMapping("/getbyid")
	public DataResult<CvForSchool> getById(@RequestParam int id){
		return this.cvForSchoolService.getById(id);
	}
	
	@GetMapping("/getall")
	public DataResult<List<CvForSchool>> getAll(){
		return this.cvForSchoolService.getAll();
	}
	
	@GetMapping("/getAllByJobseekerIdOrderByEndAtDesc")
	public DataResult<List<CvForSchool>> getAllByJobseekerIdOrderByEndAtDesc(@RequestParam int id){
		return this.cvForSchoolService.getAllByJobseekerIdOrderByEndAtDesc(id);
	}
	
	@GetMapping("/getAllByJobseekerId")
	public DataResult<List<CvForSchool>> getAllByJobseekerId(@RequestParam int id){
		return this.cvForSchoolService.getAllByJobseekerId(id);
	}
}