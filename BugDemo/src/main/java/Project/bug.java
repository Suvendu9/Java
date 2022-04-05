package Project;

import java.time.LocalDateTime;

public class bug {
	
	private String email; 
	private String owner;
	private int priority;
	STATUS status;
	private String projectowner;
	private LocalDateTime createddate;
	private LocalDateTime completiondate;
	private String description;
	//, attached files, 
	/*public bug(BugProject bg) {
		
		super().name
		
	}*/
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public String getProjectowner() {
		return projectowner;
	}
	public void setProjectowner(String projectowner) {
		this.projectowner = projectowner;
	}
	public LocalDateTime getCreateddate() {
		return createddate;
	}
	public void setCreateddate() {
		
		LocalDateTime now = LocalDateTime.now();
		this.createddate = now;
	}
	public LocalDateTime getCompletiondate() {
		return completiondate;
	}
	public void setCompletiondate() {
		LocalDateTime now = LocalDateTime.now();
		this.completiondate = now;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void updatestatus(STATUS status) {
		this.status=status; 
		
	}
	public void updatedescription(String describe) {
		this.description=describe;
	}
	public void updatepriority(int priority) {
		this.priority=priority;
	}
}
