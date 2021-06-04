package kodlamaio.hrms.business.abstracts;

import java.util.List;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CvForSchool;


public interface CvForSchoolService {
	Result add(CvForSchool cvForSchool);
	Result update(CvForSchool cvForSchool);
	Result delete(int id);
	DataResult<CvForSchool> getById(int id);	
	DataResult<List<CvForSchool>> getAll();
	DataResult<List<CvForSchool>> getAllByJobseekerIdOrderByEndAtDesc(int id);
	DataResult<List<CvForSchool>> getAllByJobseekerId(int id);
}