package conspicuum.entity;

import conspicuum.validator.Name;
import conspicuum.validator.Year;
import org.hibernate.validator.constraints.*;
import org.springframework.format.annotation.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.*;

public class User {

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

	@DateTimeFormat(pattern = "MM/dd/yyyy")
	@Past
	@Year(2000)
	@NotNull(message = "The Date must be specified")
	private Date date;

	@NotNull(message = "The eMail must be specified")
	@Email(message = "invalid e-mai")
	private String eMail;


	public User() {
	}

	public User(String fistName, String lastName, String patronymic, String eMail, Date date) {
		this.fistName = fistName;
		this.lastName = lastName;
		this.patronymic = patronymic;
		this.eMail = eMail;
		this.date = date;
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

	@Override
	public String toString() {
		return "User{" +
				"fistName='" + fistName + '\'' +
				", lastName='" + lastName + '\'' +
				", patronymic='" + patronymic + '\'' +
				", date=" + date +
				", eMail='" + eMail + '\'' +
				'}';
	}
}
	
