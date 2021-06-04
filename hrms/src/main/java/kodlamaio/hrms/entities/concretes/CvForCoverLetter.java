package kodlamaio.hrms.entities.concretes;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "cover_letters_cv")
@NoArgsConstructor
@AllArgsConstructor
public class CvForCoverLetter extends Basic{
	
	@Column(name = "content")
	private String content;
	
	@ManyToOne()
	@JoinColumn(name = "jobseeker_id")
	@JsonIgnore
	private Jobseeker jobseeker;
	
}
