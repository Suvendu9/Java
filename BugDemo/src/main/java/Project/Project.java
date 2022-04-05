package Project;

import java.util.*;
import java.time.LocalDateTime; 
public class Project {

	private String name;
	private String description;
	private LocalDateTime createdate;
	private LocalDateTime completeddate;
	private String owner;
	List<bug> al= new ArrayList<bug>();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDateTime getCreatedate() {
		return createdate;
	}
	public void setCreatedate() {
		LocalDateTime now = LocalDateTime.now();
		this.createdate = now;
	}
	public LocalDateTime getCompleteddate() {
		return completeddate;
	}
	public void setCompleteddate(Date completeddate) {
		LocalDateTime now = LocalDateTime.now();
		this.completeddate = now;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
		
}
