package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import kodlamaio.hrms.entities.concretes.CvForExperience;

public interface CvForExperienceDao extends JpaRepository<CvForExperience, Integer>{
	CvForExperience getById(int id);
	List<CvForExperience> getAllByJobseeker_idOrderByEndAtDesc(int id);
	List<CvForExperience> getAllByJobseeker_id(int id);
}