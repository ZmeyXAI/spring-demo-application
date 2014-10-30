package conspicuum.entity;


import conspicuum.validator.Name;
import conspicuum.validator.Year;
import org.apache.log4j.Logger;
import org.hibernate.validator.constraints.*;
import org.springframework.format.annotation.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.*;

public class UserDetail {
	private static final Logger log = Logger.getLogger(UserDetail.class);
	private long id;

	@Name
	@NotNull(message = "The name must be specified")
	@Size(min = 3, max = 60, message = "Size must be between {min} and {max}")
	private String fistName;

	@Name
	@NotNull(message = "The name must be specified")
	@Size(min = 3, max = 60, message = "Size must be between {min} and {max}")
	private String lastName;

	@Name
	@Size(min = 3, max = 60, message = "Size must be between {min} and {max}")
	private String patronymic;

	@DateTimeFormat(pattern = "MM/DD/YYYY")
	@Past
	@Year(2000)
	@NotNull(message = "The Data must be specified")
	private Date date;

	@NotNull(message = "The eMail must be specified")
	@Email(message = "Specified email can not exist")
	private String eMail;

	@URL(message = "Specified URL can not exist")
	private String homePage;

	private Long GroupId;


	public UserDetail(long id) {
		this.id = id;
	}

	public UserDetail(long id, String fistName, String lastName, Date date, String eMail) {
			this.id = id;
			this.fistName = fistName;
			this.lastName = lastName;
			this.date = date;
			this.eMail = eMail;
		}
	
	public long getId() {
		return id;
	}
	

	public void setId(long id) {
		this.id = id;
	}

	public Long getGroupId() {
		return GroupId;
	}

	public void setGroupId(Long groupId) {
		GroupId = groupId;
	}

	public String getFistName() {
		return fistName;
	}

	public void setFistName(String fistName) {
		this.fistName = fistName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getHomePage() {
		return homePage;
	}

	public void setHomePage(String homePage) {
		this.homePage = homePage;
	}

	@Override
	public String toString() {
		return "UserDetail{" +
				"id=" + id +
				", fistName='" + fistName + '\'' +
				", lastName='" + lastName + '\'' +
				", patronymic='" + patronymic + '\'' +
				", date=" + date +
				", GroupId=" + GroupId +
				", eMail='" + eMail + '\'' +
				", homePage='" + homePage + '\'' +
				'}';
	}
}
