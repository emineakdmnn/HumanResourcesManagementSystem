package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import kodlamaio.hrms.entities.concretes.CvForProgrammingSkills;


public interface CvForProgrammingSkillsDao extends JpaRepository<CvForProgrammingSkills, Integer>{
	CvForProgrammingSkills getById(int id);
	List<CvForProgrammingSkills> getAllByJobseeker_id(int id);
}