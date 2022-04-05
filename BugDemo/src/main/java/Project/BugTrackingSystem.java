package Project;

import java.util.*;

public class BugTrackingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Project project = new Project();
		bug bg1=new bug();
		
		bg1.setPriority(2);
		bg1.setOwner("Suvendu");
		bg1.setDescription("Error in count of records");
		bg1.setCreateddate();
		bg1.setEmail("test1@gmail.com");
		bg1.setProjectowner(project.getOwner());
		
		System.out.println("Project and bug details");
		System.out.println(bg1.getPriority()+"  "+bg1.getDescription()+"  "+bg1.getEmail()+"  "+bg1.getOwner()+"  "+bg1.getCreateddate());
	}

}