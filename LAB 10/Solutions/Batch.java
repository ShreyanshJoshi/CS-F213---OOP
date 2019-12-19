/**
    * This class simulates a Batch in BITS
    *
    * @author Anurag Madnawat, Sarthak Agarwal
    * @version 12-November-2019
    */

import java.util.*;

public class Batch {
	
	/**
     * studentsOfBatch is an ArrayList of Student objects who are in this batch.
     */
	private ArrayList<Student> studentsOfBatch;
	
	/**
     * batch represents a batch in BITS.
     */
	private String batch;
	
	/**
     * Constructor for Batch.<br>
     * Initialize the ArrayList and batch variables.
     * @param batch A batch in BITS.
     */
	public Batch(String batch){
		this.batch=batch;
		this.studentsOfBatch = new ArrayList<Student>();
	}
	
	/**
     * @param student Object of class Student which belongs to this batch. 
     * This method adds a Student object to the ArrayList of the batch.
     */
	void addStudenttoBatch(Student student)
	{
		this.studentsOfBatch.add(student);
	}
	
	/**
     * This returns the number of students in the batch.
     * @return Number of students in the batch.
     */
	int getBatchSize() {
		return this.studentsOfBatch.size();
	}
	
	/**
     * Sort the ArrayList of Students according to their ID in lexicographic order. Use the IDComparator of Student.
     */
	void sortByID() {
		Collections.sort(this.studentsOfBatch,Student.IDComparator);
	}
	
	/**
     * Sort the ArrayList of Students according to their CGPA. Use CGPAComparator of Student.
     */
	void sortByCGPA() {
		Collections.sort(this.studentsOfBatch,Student.CGPAComparator);
	}
	
	/**
     *@param branch The branch from which we need to find the Student with max CGPA in that branch.
     *@return Student object of the Student with max CGPA in the given branch.
     */
	Student findMaxCGPA(String branch) {
		
		float maxCGPA=0;
		Student ret = null;
		for(Student student : this.studentsOfBatch) {
			if(student.getCGPA()>maxCGPA && student.getBranch().equals(branch)){
				maxCGPA=student.getCGPA();
				ret = student;
			}
		}
		
		return ret;
	}
	
	/**
     * @return ArrayList studentsOfBatch.
     */
	ArrayList<Student> allStudents(){
		return this.studentsOfBatch;
	}
}
