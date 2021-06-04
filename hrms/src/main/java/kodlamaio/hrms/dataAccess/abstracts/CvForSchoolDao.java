package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import kodlamaio.hrms.entities.concretes.CvForSchool;

public interface CvForSchoolDao extends JpaRepository<CvForSchool, Integer>{
	CvForSchool getById(int id);
	List<CvForSchool> getAllByJobseeker_idOrderByEndAtDesc(int id);
	List<CvForSchool> getAllByJobseeker_id(int id);
}