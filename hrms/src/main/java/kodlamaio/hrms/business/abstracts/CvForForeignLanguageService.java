package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CvForForeignLanguage;

public interface CvForForeignLanguageService {
	Result add(CvForForeignLanguage cvForForeignLanguage);
	Result update(CvForForeignLanguage cvForForeignLanguage);
	Result delete(int id);
	DataResult<CvForForeignLanguage> getById(int id);	
	DataResult<List<CvForForeignLanguage>> getAll();
	DataResult<List<CvForForeignLanguage>> getAllByJobseekerId(int id);
}