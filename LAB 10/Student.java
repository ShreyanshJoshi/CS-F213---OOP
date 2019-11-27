 /**
    * This class simulates a Student in BITS
    *
    * @author Anurag Madnawat, Sarthak Agarwal
    * @version 12-November-2019
    */

import java.util.Comparator;

public class Student {
	
	/**
     * CURRENT_YEAR represents the current academic year
     */
	private static int CURRENT_YEAR=2019;
	
	/**
     * semesterWiseGPA is an array which holds the semester wise GPA of a student. Initialize it to 2019<br>
     * For example,<br>
     * semesterWiseGPA[0]=SEM1 GPA. 
     */
	private float semesterWiseGPA[];
	
	/**
     * ID represents the ID of the student in the BITS ID format. For example, 2018A7PS0001G.
     */
	private String ID;
	
	/**
     * name represents name of the student.
     */
	private String name;

	/**
     * Constructor for Student.
     * @param ID ID of the student.
     * @param name Name of the student.
     * Also, allocate space for the semesterWiseGPA array based on batch of the student(extract this from ID number) and the current year.<br>
     * For example, if the student is from the 2018 batch, the semesterWiseGPA array must be of size 2.
     */
	public Student(String ID,String name) {
		this.ID=ID;
		this.name=name;
		String batch = getBatch();
		this.semesterWiseGPA = new float[(CURRENT_YEAR-Integer.parseInt(batch))*2];
	}
	
	/**
     * Calculates the CGPA of the student. Assume each semester has equal credits.
     * @return CGPA of the student.
     */
	float getCGPA() {
		float CGPA=0;
		float sum=0;
		for(int i=0;i<this.semesterWiseGPA.length;i++) {
			sum=sum+this.semesterWiseGPA[i];
		}
		try {
			CGPA = sum/(this.semesterWiseGPA.length);
		} catch(ArithmeticException e){
			System.out.println ("Can't be divided by Zero"+e);
		}
		return CGPA;
	}
	
	/**
     * Extract branch from the ID of the student and return it.
     * @return branch of the student.
     */
	String getBranch() {
		String branch=this.ID.substring(4,6);
		return branch;
	}
	
	/**
     * Extract batch from the ID of the student and return it.
     * @return String batch.
     */
	String getBatch() {
		String batch=this.ID.substring(0,4);
		return batch;
	}
	
	/**
     * @param semester The semester for which the GPA has been provided. 
     * @param GPA GPA of the given semester.
     * This method adds the given GPA to the correct position in the semesterWiseGPA array.<br>
     * For example,if semester is 1, adds GPA to the 0th index of the array.
     * @return boolean true if GPA added successfully, else return false.
     */
	boolean addGPA(String semester, String GPA)
	{
		int sem = Integer.parseInt(semester);
		
		if(sem>this.semesterWiseGPA.length)
		{
			return false;
		}
		sem--;
		this.semesterWiseGPA[sem]=Float.parseFloat(GPA);
		return true;
	}
	
	/**
	 * This method returns a string of the student details in the format:<br>
	 * ID | Name | CGPA <br>
	 * Also append a newline character at the end.
     * @return String which contains required info about the student. 
     */
	String studentInfo() {
		String result = "ID: "+this.ID + " | Name: "+this.name+" | CGPA: "+this.getCGPA()+"\n";
		return result;
	}
	
	/**
	 * Implement a custom comparator to compare two students by their ID numbers, such that when sorted, Students are sorted by lexicographic order of ID numbers.
     */
	 public static Comparator<Student> IDComparator = new Comparator<Student>() {         
		    @Override         
		    public int compare(Student student1, Student student2) { 
		    	if(student1.ID.compareTo(student2.ID)<0) {
		    		return -1;
		    	}
		    	else if(student1.ID.equals(student2.ID)) {
		    		return 0;
		    	}
		    	else if(student1.ID.compareTo(student2.ID)>0) {
		    		return 1;
		    	}
		    	return 0;
		    	
		    }     
	};     
	
	/**
	 * Implement a custom comparator to compare two students by their CGPA. Resolve ties using ID number(lexicographic order). Must be sorted by descending order of CGPA.
     */
	public static Comparator<Student> CGPAComparator = new Comparator<Student>() {         
	    @Override         
	    public int compare(Student student1, Student student2) { 
	    	if(student1.getCGPA()>student2.getCGPA()) {
	    		return -1;
	    	}
	    	else if(student1.getCGPA()==student2.getCGPA() && student1.ID.compareTo(student2.ID)<0) {
	    		return -1;
	    	}
	    	else if(student1.getCGPA()==student2.getCGPA() && student1.ID.compareTo(student2.ID)>0) {
	    		return 1;
	    	}
	    	else if(student1.getCGPA()<student2.getCGPA()) {
	    		return 1;
	    	}
	    	return 0;
	    	
	    }     
	};     
	
}
