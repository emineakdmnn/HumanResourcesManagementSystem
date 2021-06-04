package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CvForLink;

public interface CvForLinkService {
	Result add(CvForLink cvForLink);
	Result update(CvForLink cvForLink);
	Result delete(int id);
	DataResult<CvForLink> getById(int id);	
	DataResult<List<CvForLink>> getAll();
	DataResult<List<CvForLink>> getAllByJobseekerId(int id);
}