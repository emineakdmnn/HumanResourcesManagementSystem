package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import kodlamaio.hrms.business.abstracts.CvForForeignLanguageService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CvForForeignLanguage;

@RestController
@RequestMapping("/api/foreignlanguages")
public class ForeignLanguagesController {

	private CvForForeignLanguageService cvForForeignLanguageService;

	@Autowired
	public ForeignLanguagesController(CvForForeignLanguageService cvForForeignLanguageService) {
		super();
		this.cvForForeignLanguageService = cvForForeignLanguageService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CvForForeignLanguage cvForForeignLanguage){
		return this.cvForForeignLanguageService.add(cvForForeignLanguage);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody CvForForeignLanguage cvForForeignLanguage){
		return this.cvForForeignLanguageService.update(cvForForeignLanguage);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id){
		return this.cvForForeignLanguageService.delete(id);
	}
	
	@GetMapping("/getbyid")
	public DataResult<CvForForeignLanguage> getById(@RequestParam("id") int id){
		return this.cvForForeignLanguageService.getById(id);
	}
	
	@GetMapping("/getall")
	public DataResult<List<CvForForeignLanguage>> getAll(){
		return this.cvForForeignLanguageService.getAll();
	}
	
	@GetMapping("/getAllByJobseekerId")
	public DataResult<List<CvForForeignLanguage>> getAllByJobseekerId(@RequestParam int id){
		return this.cvForForeignLanguageService.getAllByJobseekerId(id);
	}
}