package kodlamaio.hrms.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kodlamaio.hrms.business.abstracts.CvForForeignLanguageService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CvForForeignLanguageDao;
import kodlamaio.hrms.entities.concretes.CvForForeignLanguage;

@Service
public class CvForForeignLanguageManager implements CvForForeignLanguageService{

	private CvForForeignLanguageDao cvForForeignLanguageDao;
	
	@Autowired
	public CvForForeignLanguageManager(CvForForeignLanguageDao cvForForeignLanguageDao) {
		super();
		this.cvForForeignLanguageDao = cvForForeignLanguageDao;
	}

	@Override
	public Result add(CvForForeignLanguage cvForForeignLanguage) {
		this.cvForForeignLanguageDao.save(cvForForeignLanguage);
		return new SuccessResult("Foreign language has been added.");
	}

	@Override
	public Result update(CvForForeignLanguage cvForForeignLanguage) {
		this.cvForForeignLanguageDao.save(cvForForeignLanguage);
		return new SuccessResult("Foreign language has been updated.");
	}

	@Override
	public Result delete(int id) {
		this.cvForForeignLanguageDao.deleteById(id);;
		return new SuccessResult("Foreign language has been deleted.");
	}

	@Override
	public DataResult<CvForForeignLanguage> getById(int id) {
		return new SuccessDataResult<CvForForeignLanguage>(this.cvForForeignLanguageDao.getById(id));
	}

	@Override
	public DataResult<List<CvForForeignLanguage>> getAll() {
		return new SuccessDataResult<List<CvForForeignLanguage>>(this.cvForForeignLanguageDao.findAll());
	}

	@Override
	public DataResult<List<CvForForeignLanguage>> getAllByJobseekerId(int id) {
		return new SuccessDataResult<List<CvForForeignLanguage>>(this.cvForForeignLanguageDao.getAllByJobseeker_id(id));
	}

}