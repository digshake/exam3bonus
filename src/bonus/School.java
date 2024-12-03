package bonus;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/*
 * We wish to create a School class. Specifically, we are interested in keeping track of what
 * students are enrolled at the school. For the purposes of this problem, we will be using the Student
 * class exactly as it appeared in assignment 7.
 * 
 * Complete each item of the implementation of the class in the designated areas. A list of methods in
 * List and Student can be found on the final page of the exam.
 */
public class School {

	//do not change
	private String name;
	private List<Student> students;
	
	// Write the constructor for the School class.
	// When a school is created, there should be no students enrolled.
	public School(String n) {
		this.name = n;
		this.students = new LinkedList<>();
	}
	
	
	
	/**
	* Returns true if the given Student is on the list of enrolled Students
	*/
	public boolean isEnrolled ( Student s) {
		return students.contains(s);
	}
	
	/**
	* First checks to ensure that the given student is not
	* enrolled before adding them to the list of enrolled students.
	*/
	public void enroll (Student s) {
		if(!isEnrolled(s)) {
			students.add(s);
		}
	}
	
	/**
	* Removes the given student from the list of enrolled students
	*/
	public void remove (Student s) {
		students.remove(s);
	}
	
	public String getName() {
		return this.name;
	}
}
