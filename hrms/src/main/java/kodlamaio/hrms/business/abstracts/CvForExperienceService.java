package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CvForExperience;

public interface CvForExperienceService {
	Result add(CvForExperience cvForExperience);
	Result update(CvForExperience cvForExperience);
	Result delete(int id);
	DataResult<CvForExperience> getById(int id);	
	DataResult<List<CvForExperience>> getAll();
	DataResult<List<CvForExperience>> getAllByJobseekerIdOrderByEndAtDesc(int id);
	DataResult<List<CvForExperience>> getAllByJobseekerId(int id);
}
