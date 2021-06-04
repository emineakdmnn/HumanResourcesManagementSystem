package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import kodlamaio.hrms.entities.concretes.CvForForeignLanguage;

public interface CvForForeignLanguageDao extends JpaRepository<CvForForeignLanguage, Integer>{
	CvForForeignLanguage getById(int id);
	List<CvForForeignLanguage> getAllByJobseeker_id(int id);
}