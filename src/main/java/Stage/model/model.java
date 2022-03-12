package Stage.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "Employee")
public class model {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "first_name")
	private String first_name;
	@Column(name = "last_name")
	private String last_name;
	@Column(name = "emailId")
	private String emailId;
	
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public model() {
		super();
			}
	public model(String first_name, String last_name, String emailId) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.emailId = emailId;
	}
	@Override
	public String toString() {
		return "model [Id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", emailId=" + emailId
				+ "]";
	}
	
}
