package kodlamaio.hrms.api.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import kodlamaio.hrms.business.abstracts.CvForCoverLetterService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CvForCoverLetter;

@RestController
@RequestMapping("/api/coverletters")
public class CoverLettersController {

	private CvForCoverLetterService cvForCoverLetterService;

	@Autowired
	public CoverLettersController(CvForCoverLetterService cvForCoverLetterService) {
		super();
		this.cvForCoverLetterService = cvForCoverLetterService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CvForCoverLetter cvForCoverLetter){
		return this.cvForCoverLetterService.add(cvForCoverLetter);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody CvForCoverLetter cvForCoverLetter){
		return this.cvForCoverLetterService.update(cvForCoverLetter);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id){
		return this.cvForCoverLetterService.delete(id);
	}
	
	@GetMapping("/getbyid")
	public DataResult<CvForCoverLetter> getById(@RequestParam("id") int id){
		return this.cvForCoverLetterService.getById(id);
	}
	
	@GetMapping("/getall")
	public DataResult<List<CvForCoverLetter>> getAll(){
		return this.cvForCoverLetterService.getAll();
	}
	
}