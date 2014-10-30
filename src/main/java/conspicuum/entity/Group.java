package conspicuum.entity;

import org.apache.log4j.Logger;
import org.springframework.format.annotation.*;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.*;
import java.util.concurrent.atomic.*;

public class Group {
	private static final Logger log = Logger.getLogger(Group.class);
	
	private static AtomicLong uniqueId = new AtomicLong();

	private long id;

	@NotNull(message = "The name must be specified")
	@Size(min = 3, max = 20, message = "Size must be between {min} and {max}")
	private String nameGroup;

	@NotNull(message = "The name must be specified")
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	@Past
	private Date effDate;

	@DateTimeFormat(pattern = "MM/dd/yyyy")
	@Past
	@Future
	private Date expDate;

	public Group(long id) {
		id = uniqueId.getAndIncrement();
	}

	public Group(long id, String nameGroup, Date effDate) {
		id = uniqueId.getAndIncrement();
		this.nameGroup = nameGroup;
		this.effDate = effDate;
	}

	public long getId() {
		return id;
	}


	public String getNameGroup() {
		return nameGroup;
	}

	public void setNameGroup(String nameGroup) {
		this.nameGroup = nameGroup;
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
		return "Group{" +
				"id=" + id +
				", nameGroup='" + nameGroup + '\'' +
				", effDate=" + effDate +
				", expDate=" + expDate +
				'}';
	}
}
