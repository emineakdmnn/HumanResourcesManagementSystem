package kodlamaio.hrms.business.concretes;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kodlamaio.hrms.business.abstracts.CvForExperienceService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CvForExperienceDao;
import kodlamaio.hrms.entities.concretes.CvForExperience;

@Service
public class CvForExperienceManager implements CvForExperienceService{

	private CvForExperienceDao cvForExperienceDao;
	
	@Autowired
	public CvForExperienceManager(CvForExperienceDao cvForExperienceDao) {
		super();
		this.cvForExperienceDao = cvForExperienceDao;
	}

	@Override
	public Result add(CvForExperience cvForExperience) {
		this.cvForExperienceDao.save(cvForExperience);
		return new SuccessResult("Experience has been added.");
	}

	@Override
	public Result update(CvForExperience cvForExperience) {
		this.cvForExperienceDao.save(cvForExperience);
		return new SuccessResult("Experience has been updated.");
	}

	@Override
	public Result delete(int id) {
		this.cvForExperienceDao.deleteById(id);
		return new SuccessResult("Experience has been deleted.");
	}

	@Override
	public DataResult<CvForExperience> getById(int id) {
		return new SuccessDataResult<CvForExperience>(this.cvForExperienceDao.getById(id));
	}

	@Override
	public DataResult<List<CvForExperience>> getAll() {
		return new SuccessDataResult<List<CvForExperience>>(this.cvForExperienceDao.findAll());
	}

	@Override
	public DataResult<List<CvForExperience>> getAllByJobseekerIdOrderByEndAtDesc(int id) {
		return new SuccessDataResult<List<CvForExperience>>(this.cvForExperienceDao.getAllByJobseeker_idOrderByEndAtDesc(id));
	}

	@Override
	public DataResult<List<CvForExperience>> getAllByJobseekerId(int id) {
		return new SuccessDataResult<List<CvForExperience>>(this.cvForExperienceDao.getAllByJobseeker_id(id));
	}
}