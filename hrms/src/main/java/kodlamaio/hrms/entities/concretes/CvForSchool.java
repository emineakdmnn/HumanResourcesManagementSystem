package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="schools_cv")
@NoArgsConstructor
@AllArgsConstructor
public class CvForSchool extends Basic{

	@Column(name = "name")
	private String schoolName;
	
	@Column(name = "department")
	private String department;
	
	@Column(name = "start_at")
	private LocalDate startAt;
	
	@Column(name = "end_at", nullable = true)
	private LocalDate endAt;

	@ManyToOne()
	@JoinColumn(name = "jobseeker_id")
	private Jobseeker jobseeker;
}