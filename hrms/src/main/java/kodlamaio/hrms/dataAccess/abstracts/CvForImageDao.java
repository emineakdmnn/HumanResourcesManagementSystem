package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import kodlamaio.hrms.entities.concretes.CvForImage;

public interface CvForImageDao extends JpaRepository<CvForImage, Integer>{

	CvForImage getById(int id);
	CvForImage getByJobseeker_id(int id);
}