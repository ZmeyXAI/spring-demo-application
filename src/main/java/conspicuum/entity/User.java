package conspicuum.entity;

import org.apache.log4j.Logger;
import org.springframework.format.annotation.*;

import javax.validation.constraints.*;
import java.util.*;
import java.util.concurrent.atomic.*;

public class User {

	private static final Logger log = Logger.getLogger(User.class);
	
	private static AtomicLong uniqueId = new AtomicLong();

	private long id;

	@NotNull(message = "The name must be specified")
	@Size(min = 3, max = 20, message = "Size must be between {min} and {max}")
	@Pattern(regexp = "^[a-zA-Z0-9_-]",
			message = "The login must contain only lowercase, " +
					"uppercase letters, digits, and \"_\" and \"-\"")
	private String login;

	@Pattern(regexp = "^[a-z0-9_-]", message = "not correct password")
	@Size(min = 3, max = 20, message = "Size must be between {min} and {max}")
	private String password;

	@DateTimeFormat(pattern = "MM/dd/yyyy")
	@Past
	@NotNull(message = "The Data must be specified")
	private Date effDate;

	@DateTimeFormat(pattern = "MM/dd/yyyy")
	@Past
	@Future
	private Date expDate;


	public User() {
		setId();
	}

	public User(long id, String login, String password, Date effDate) {
		id = uniqueId.getAndIncrement();
		this.login = login;
		this.password = password;
		this.effDate = effDate;
	}

	public long getId() {
		return id;
	}

	public void setId() {
		this.id = uniqueId.getAndIncrement();
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getEffDate() {
		return effDate;
	}

	public void setEffDate(Date effDate) {
		this.effDate = effDate;
	}

	public Date getExpDate() {
		return expDate;
	}

	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", login='" + login + '\'' +
				", password='" + password + '\'' +
				", effDate=" + effDate +
				", expDate=" + expDate +
				'}';
	}
}
