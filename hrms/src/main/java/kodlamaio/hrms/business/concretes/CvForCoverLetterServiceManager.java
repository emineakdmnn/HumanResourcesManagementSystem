package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CvForCoverLetterService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CvForCoverLetterDao;
import kodlamaio.hrms.entities.concretes. CvForCoverLetter;

@Service
public class CvForCoverLetterServiceManager implements CvForCoverLetterService{

	private CvForCoverLetterDao cvForCoverLetterDao;
	
	@Autowired
	public CvForCoverLetterServiceManager(CvForCoverLetterDao cvForCoverLetterDao) {
		super();
		this.cvForCoverLetterDao = cvForCoverLetterDao;
	}

	@Override
	public Result add(CvForCoverLetter cvForCoverLetter) {
		this.cvForCoverLetterDao.save(cvForCoverLetter);
		return new SuccessResult("Cover letter has been added.");
	}

	@Override
	public Result update(CvForCoverLetter cvForCoverLetter) {
		this.cvForCoverLetterDao.save(cvForCoverLetter);
		return new SuccessResult("Cover letter has been updated.");
	}

	@Override
	public Result delete(int id) {
		this.cvForCoverLetterDao.deleteById(id);
        return new SuccessResult("Cover letter has been deleted.");
	}

	@Override
	public DataResult<CvForCoverLetter> getById(int id) {
		return new SuccessDataResult<CvForCoverLetter>(this.cvForCoverLetterDao.getById(id));
	}

	@Override
	public DataResult<List<CvForCoverLetter>> getAll() {
		return new SuccessDataResult<List<CvForCoverLetter>>(this.cvForCoverLetterDao.findAll());
	}

}