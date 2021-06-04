package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import kodlamaio.hrms.entities.concretes.CvForLink;

public interface CvForLinkDao extends JpaRepository<CvForLink, Integer>{
	CvForLink getById(int id);
	List<CvForLink> getAllByJobseeker_id(int id);
}