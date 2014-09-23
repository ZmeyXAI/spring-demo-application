package conspicuum.User;

import conspicuum.validator.User.Name;
import conspicuum.validator.User.Year;
import org.springframework.format.annotation.*;

import javax.validation.constraints.Past;
import java.util.*;

public class User {

	@Name
	private String name;

	@DateTimeFormat(pattern = "MM.dd.yyyy")
	@Past
	@Year(2000)
	private Date ageDate;

	public User(String name, Date ageDate) {
		this.name = name;
		this.ageDate = ageDate;
	}

	public User() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getAgeDate() {
		return ageDate;
	}

	public void setAgeDate(Date ageDate) {
		this.ageDate = ageDate;
	}
}
