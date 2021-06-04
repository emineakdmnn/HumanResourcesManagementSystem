package kodlamaio.hrms.business.concretes;

import java.util.List;
import org.springframework.stereotype.Service;
import kodlamaio.hrms.business.abstracts.CvForExperienceService;
import kodlamaio.hrms.business.abstracts.CvForForeignLanguageService;
import kodlamaio.hrms.business.abstracts.CvForImageService;
import kodlamaio.hrms.business.abstracts.JobseekerService;
import kodlamaio.hrms.business.abstracts.CvForLinkService;
import kodlamaio.hrms.business.abstracts.CvForProgrammingSkillsService;
import kodlamaio.hrms.business.abstracts.CvForSchoolService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobseekerDao;
import kodlamaio.hrms.entities.concretes.Jobseeker;
import kodlamaio.hrms.entities.dtos.JobSeekerCvDto;


@Service
public class JobseekerManager implements JobseekerService {

	private JobseekerDao jobseekerDao;
	private CvForExperienceService cvForExperienceService;
	private CvForForeignLanguageService cvForForeignLanguageService;
	private CvForImageService cvForImageService;
	private CvForLinkService cvForLinkService;
	private CvForProgrammingSkillsService cvForProgrammingSkillsService;
	private CvForSchoolService cvForSchoolService;

	public JobseekerManager(JobseekerDao jobseekerDao, CvForExperienceService cvForExperienceService,
			CvForForeignLanguageService cvForForeignLanguageService, CvForImageService cvForImageService,
			CvForLinkManager linkForCvService, CvForProgrammingSkillsService cvForProgrammingSkillsService,
			CvForSchoolService cvForSchoolService) {
		super();
		this.jobseekerDao = jobseekerDao;
		this.cvForExperienceService = cvForExperienceService;
		this.cvForForeignLanguageService = cvForForeignLanguageService;
		this.cvForImageService = cvForImageService;
		this.cvForLinkService = cvForLinkService;
		this.cvForProgrammingSkillsService = cvForProgrammingSkillsService;
		this.cvForSchoolService = cvForSchoolService;
	}

	@Override
	public Result add(Jobseeker jobseeker) {
		this.jobseekerDao.save(jobseeker);
		return new SuccessResult("Jobseeker has been added.");
	}

	@Override
	public Result update(Jobseeker jobseeker) {
		this.jobseekerDao.save(jobseeker);
		return new SuccessResult("Jobseeker has been updated.");
	}

	@Override
	public Result delete(int id) {
		this.jobseekerDao.deleteById(id);
		return new SuccessResult("Jobseeker has been deleted.");
	}

	@Override
	public DataResult<Jobseeker> getById(int id) {
		return new SuccessDataResult<Jobseeker>(this.jobseekerDao.getById(id));
	}

	@Override
	public DataResult<List<Jobseeker>> getAll() {
		return new SuccessDataResult<List<Jobseeker>>(this.jobseekerDao.findAll());
	}

	@Override
	public DataResult<Jobseeker> getJobseekerByNationalId(String nationalId) {
		return new SuccessDataResult<Jobseeker>(this.jobseekerDao.findJobseekerByNationalId(nationalId));
	}

	@Override
	public DataResult<JobSeekerCvDto> getJobseekerCvById(int id) {
		Jobseeker jobseeker = this.jobseekerDao.getById(id);
		JobSeekerCvDto cv = new JobSeekerCvDto();
		cv.experiences = jobseeker.getExperiences();
		cv.languages = jobseeker.getLanguages();
		cv.image = jobseeker.getImage();
		cv.links = jobseeker.getLinks();
		cv.programmingSkills = jobseeker.getProgramingSkills();
		cv.schools = jobseeker.getSchools();
		return new SuccessDataResult<JobSeekerCvDto>(cv);
	}

}
