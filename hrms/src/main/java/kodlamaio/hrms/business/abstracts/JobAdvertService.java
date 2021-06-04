package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertService {

	Result add(JobAdvertisement jobAdvert);
	Result update(JobAdvertisement jobAdvert);
	Result delete(int id);
	Result changeOpenToClose(int id);
	DataResult<JobAdvertisement> getById(int id);	
	DataResult<List<JobAdvertisement>> getAll();
	DataResult<List<JobAdvertisement>> getAllOpenJobAdvertList();
	DataResult<List<JobAdvertisement>> findAllByOrderByPublishedAt();
	DataResult<List<JobAdvertisement>> getAllOpenJobAdvertByEmployer(int id);
}
