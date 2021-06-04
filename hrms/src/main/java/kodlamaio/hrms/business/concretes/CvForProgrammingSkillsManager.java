package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CvForProgrammingSkillsService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CvForProgrammingSkillsDao;
import kodlamaio.hrms.entities.concretes.CvForProgrammingSkills;



@Service
public class CvForProgrammingSkillsManager implements CvForProgrammingSkillsService{

	private CvForProgrammingSkillsDao cvForProgrammingSkillsDao;
	
	
	@Autowired
	public CvForProgrammingSkillsManager( CvForProgrammingSkillsDao cvForProgrammingSkillsDao) {
		super();
		this.cvForProgrammingSkillsDao = cvForProgrammingSkillsDao;
	}

	@Override
	public Result add(CvForProgrammingSkills cvForProgrammingSkills) {
		this.cvForProgrammingSkillsDao.save(cvForProgrammingSkills);
		return new SuccessResult("Programming skill has been added.");
	}

	@Override
	public Result update(CvForProgrammingSkills cvForProgrammingSkills) {
		this.cvForProgrammingSkillsDao.save(cvForProgrammingSkills);
		return new SuccessResult("Programming skill has been updated.");
	}

	@Override
	public Result delete(int id) {
		this.cvForProgrammingSkillsDao.deleteById(id);
		return new SuccessResult("Programming skill has been deleted.");
	}

	@Override
	public DataResult<CvForProgrammingSkills> getById(int id) {
		return new SuccessDataResult<CvForProgrammingSkills>(this.cvForProgrammingSkillsDao.getById(id));
	}

	@Override
	public DataResult<List<CvForProgrammingSkills>> getAll() {
		return new SuccessDataResult<List<CvForProgrammingSkills>>(this.cvForProgrammingSkillsDao.findAll());
	}

	@Override
	public DataResult<List<CvForProgrammingSkills>> getAllByJobseekerId(int id) {
		return new SuccessDataResult<List<CvForProgrammingSkills>>(this.cvForProgrammingSkillsDao.getAllByJobseeker_id(id));
	}

}