package kodlamaio.hrms.dataAccess.abstracts;
import org.springframework.data.jpa.repository.JpaRepository;
import kodlamaio.hrms.entities.concretes. CvForCoverLetter;

public interface CvForCoverLetterDao extends JpaRepository< CvForCoverLetter, Integer>{
	 CvForCoverLetter getById(int id);
}