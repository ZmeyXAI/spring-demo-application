package conspicuum.entity;

import conspicuum.validator.Name;
import conspicuum.validator.Year;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

public class User {

	@Name
	@NotNull(message="The name must be specified")
	@Size(min = 3, max = 60, message="Size must be between 3 and 60")
	private String name;

	@DateTimeFormat(pattern = "MM/dd/yyyy")
	@Past
	@Year(2000)
	@NotNull(message="The Data must be specified")
	private Date date;

	
	public User(String name, Date date) {
		this.name = name;
		this.date = date;
	}

	public User() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	
}
