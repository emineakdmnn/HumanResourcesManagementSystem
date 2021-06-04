package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CvForCoverLetter;

public interface CvForCoverLetterService {

	Result add(CvForCoverLetter cvForCoverLetter);
	Result update(CvForCoverLetter cvForCoverLetter);
	Result delete(int id);
	DataResult<CvForCoverLetter> getById(int id);	
	DataResult<List<CvForCoverLetter>> getAll();
}
