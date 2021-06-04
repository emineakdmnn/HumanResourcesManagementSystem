package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.google.common.net.MediaType;

import kodlamaio.hrms.business.abstracts.CvForImageService;
import kodlamaio.hrms.business.abstracts.JobseekerService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CvForImage;
import kodlamaio.hrms.entities.concretes.Jobseeker;

@RestController
@RequestMapping("/api/images")
public class ImagesController {
	
	private CvForImageService cvForImageService;
	private JobseekerService jobseekerService;

	@Autowired
	public ImagesController(CvForImageService cvForImageService, JobseekerService jobseekerService) {
		super();
		this.cvForImageService = cvForImageService;
		this.jobseekerService = jobseekerService;
	}
	
	@PostMapping(value = "/add")
	public Result add(@RequestParam(value = "id") int id, @RequestParam(value = "imageFile") MultipartFile imageFile){
		Jobseeker jobseeker = this.jobseekerService.getById(id).getData();
		CvForImage cvForImage = new CvForImage();
		cvForImage.setJobseeker(jobseeker);
		return this.cvForImageService.add(cvForImage, imageFile);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody CvForImage cvForImage){
		return this.cvForImageService.update(cvForImage);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id){
		return this.cvForImageService.delete(id);
	}
	
	@GetMapping("/getbyid")
	public DataResult<CvForImage> getById(@RequestParam("id") int id){
		return this.cvForImageService.getById(id);
	}
	
	@GetMapping("/getall")
	public DataResult<List<CvForImage>> getAll(){
		return this.cvForImageService.getAll();
	}
	
	
	@GetMapping("/getByJobseekerId")
	public DataResult<CvForImage> getByJobseekerId(@RequestParam int id){
		return this.cvForImageService.getByJobseekerId(id);
	}
}