package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CvForSchoolService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CvForSchoolDao;
import kodlamaio.hrms.entities.concretes.CvForSchool;

@Service
public class CvForSchoolManager implements CvForSchoolService{

	private CvForSchoolDao cvForSchoolDao;
		
	@Autowired
	public CvForSchoolManager(CvForSchoolDao cvForSchoolDao) {
		super();
		this.cvForSchoolDao = cvForSchoolDao;
	}

	@Override
	public Result add(CvForSchool cvForSchool) {
		this.cvForSchoolDao.save(cvForSchool);
		return new SuccessResult("School has been added.");
	}

	@Override
	public Result update(CvForSchool cvForSchool) {
		this.cvForSchoolDao.save(cvForSchool);
		return new SuccessResult("School has been updated.");
	}

	@Override
	public Result delete(int id) {
		this.cvForSchoolDao.deleteById(id);
		return new SuccessResult("School has been deleted.");
	}

	@Override
	public DataResult<CvForSchool> getById(int id) {
		return new SuccessDataResult<CvForSchool>(this.cvForSchoolDao.getById(id));
	}

	@Override
	public DataResult<List<CvForSchool>> getAll() {
		return new SuccessDataResult<List<CvForSchool>>(this.cvForSchoolDao.findAll());
	}

	@Override
	public DataResult<List<CvForSchool>> getAllByJobseekerIdOrderByEndAtDesc(int id) {
		return new SuccessDataResult<List<CvForSchool>>(this.cvForSchoolDao.getAllByJobseeker_idOrderByEndAtDesc(id));
	}

	@Override
	public DataResult<List<CvForSchool>> getAllByJobseekerId(int id) {
		return new SuccessDataResult<List<CvForSchool>>(this.cvForSchoolDao.getAllByJobseeker_id(id));
	}

}