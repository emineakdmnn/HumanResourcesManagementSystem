package kodlamaio.hrms.entities.dtos;

import java.util.List;
import kodlamaio.hrms.entities.concretes.CvForProgrammingSkills;
import kodlamaio.hrms.entities.concretes.CvForSchool;
import kodlamaio.hrms.entities.concretes.CvForExperience;
import kodlamaio.hrms.entities.concretes.CvForForeignLanguage;
import kodlamaio.hrms.entities.concretes.CvForImage;
import kodlamaio.hrms.entities.concretes.Jobseeker;
import kodlamaio.hrms.entities.concretes.CvForLink;


public class JobSeekerCvDto {

	public Jobseeker jobseeker;
	public List<CvForSchool> schools;
	public List<CvForProgrammingSkills> programmingSkills;
	public List<CvForLink> links;
	public List<CvForForeignLanguage> languages;
	public List<CvForExperience> experiences;
	public CvForImage image;
}