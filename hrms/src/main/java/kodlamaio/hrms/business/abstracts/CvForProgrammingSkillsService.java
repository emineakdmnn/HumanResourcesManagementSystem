package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CvForProgrammingSkills;


public interface CvForProgrammingSkillsService {
	Result add(CvForProgrammingSkills cvForProgrammingSkills);
	Result update(CvForProgrammingSkills cvForProgrammingSkills);
	Result delete(int id);
	DataResult<CvForProgrammingSkills> getById(int id);	
	DataResult<List<CvForProgrammingSkills>> getAll();
	DataResult<List<CvForProgrammingSkills>> getAllByJobseekerId(int id);
}