package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CvForLinkService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CvForLinkDao;
import kodlamaio.hrms.entities.concretes.CvForLink;

@Service
public class CvForLinkManager implements CvForLinkService{

	private CvForLinkDao cvForLinkDao;
	
	@Autowired
	public CvForLinkManager(CvForLinkDao cvForLinkDao) {
		super();
		this.cvForLinkDao = cvForLinkDao;
	}

	@Override
	public Result add(CvForLink cvForLink) {
		this.cvForLinkDao.save(cvForLink);
		return new SuccessResult("Link has been added.");
	}

	@Override
	public Result update(CvForLink cvForLink) {
		this.cvForLinkDao.save(cvForLink);
		return new SuccessResult("Link has been updated.");
	}

	@Override
	public Result delete(int id) {
		this.cvForLinkDao.deleteById(id);
		return new SuccessResult("Link has been deleted.");
	}

	@Override
	public DataResult<CvForLink> getById(int id) {
		return new SuccessDataResult<CvForLink>(this.cvForLinkDao.getById(id));
	}

	@Override
	public DataResult<List<CvForLink>> getAll() {
		return new SuccessDataResult<List<CvForLink>>(this.cvForLinkDao.findAll());
	}

	@Override
	public DataResult<List<CvForLink>> getAllByJobseekerId(int id) {
		return new SuccessDataResult<List<CvForLink>>(this.cvForLinkDao.getAllByJobseeker_id(id));
	}

}