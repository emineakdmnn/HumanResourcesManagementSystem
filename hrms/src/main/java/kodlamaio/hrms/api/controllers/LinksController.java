package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import kodlamaio.hrms.business.abstracts.CvForLinkService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CvForLink;

@RestController
@RequestMapping("/api/links")
public class LinksController {
	
	private CvForLinkService cvForLinkService;

	@Autowired
	public LinksController(CvForLinkService cvForLinkService) {
		super();
		this.cvForLinkService = cvForLinkService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CvForLink cvForLink){
		return this.cvForLinkService.add(cvForLink);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody CvForLink cvForLink){
		return this.cvForLinkService.update(cvForLink);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id){
		return this.cvForLinkService.delete(id);
	}
	
	@GetMapping("/getbyid")
	public DataResult<CvForLink> getById(@RequestParam("id") int id){
		return this.cvForLinkService.getById(id);
	}
	
	@GetMapping("/getall")
	public DataResult<List<CvForLink>> getAll(){
		return this.cvForLinkService.getAll();
	}
	
	@GetMapping("/getAllByJobseekerId")
	public DataResult<List<CvForLink>> getAllByJobseekerId(@RequestParam int id){
		return this.cvForLinkService.getAllByJobseekerId(id);
	}
}