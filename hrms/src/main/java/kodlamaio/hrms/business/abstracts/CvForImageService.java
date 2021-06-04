package kodlamaio.hrms.business.abstracts;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CvForImage;

public interface CvForImageService {
	Result add(CvForImage cvForImage, MultipartFile imageFile);
	Result update(CvForImage cvForImage);
	Result delete(int id);
	DataResult<CvForImage> getById(int id);	
	DataResult<List<CvForImage>> getAll();
	DataResult<CvForImage> getByJobseekerId(int id);
}