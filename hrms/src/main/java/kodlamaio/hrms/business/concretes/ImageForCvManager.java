package kodlamaio.hrms.business.concretes;

import java.util.List;
import java.util.Map;
import javax.swing.plaf.multi.MultiInternalFrameUI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.cloudinary.Url;
import kodlamaio.hrms.business.abstracts.CvForImageService;
import kodlamaio.hrms.business.abstracts.JobseekerService;
import kodlamaio.hrms.core.utilities.imageUpload.ImageUploadService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CvForImageDao;
import kodlamaio.hrms.entities.concretes.CvForImage;
import kodlamaio.hrms.entities.concretes.Jobseeker;

@Service
public class ImageForCvManager implements CvForImageService{

	private CvForImageDao cvForImageDao;
	private ImageUploadService imageUploadService;

	@Autowired
	public ImageForCvManager(CvForImageDao cvForImageDao, ImageUploadService imageUploadService) {
		super();
		this.cvForImageDao = cvForImageDao;
		this.imageUploadService = imageUploadService;
	}
	
	@Override
	public Result add(CvForImage cvForImage , MultipartFile imageFile) {
		Map<String,String> uploadImage = this.imageUploadService.uploadImageFile(imageFile).getData();
		cvForImage.setUrl(uploadImage.get("url"));
		this.cvForImageDao.save(cvForImage);
		return new SuccessResult("Image has been added.");
	}

	@Override
	public Result update(CvForImage cvForImage) {
		this.cvForImageDao.save(cvForImage);
		return new SuccessResult("Image has been updated.");
	}

	@Override
	public Result delete(int id) {
		this.cvForImageDao.deleteById(id);
		return new SuccessResult("Image has been deleted.");
	}

	@Override
	public DataResult<CvForImage> getById(int id) {
		return new SuccessDataResult<CvForImage>(this.cvForImageDao.getById(id));
	}

	@Override
	public DataResult<List<CvForImage>> getAll() {
		return new SuccessDataResult<List<CvForImage>>(this.cvForImageDao.findAll());
	}

	@Override
	public DataResult<CvForImage> getByJobseekerId(int id) {
		return new SuccessDataResult<CvForImage>(this.cvForImageDao.getByJobseeker_id(id));
	}

}