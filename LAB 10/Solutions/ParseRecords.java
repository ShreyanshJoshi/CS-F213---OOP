import java.io.*;
import java.util.*;
public class ParseRecords {
	HashMap<String,Student> IDtoStudentObj;
	HashMap<String,Batch> batchtoBatchObj;

	public ParseRecords() {
		IDtoStudentObj = new HashMap<String,Student> ();						// HASHMAP 1
		batchtoBatchObj = new HashMap<String,Batch> ();							// HASHMAP 2
	}
	int getRecords(String filename) throws FileNotFoundException,IOException {
		BufferedReader br = new BufferedReader(new FileReader(filename));
		int count=0;
		String line;
		while((line = br.readLine())!=null) {
			count+=1;

			String a[] = line.split(" ");
			String f = a[2];									// semester
			String h = a[3];									// gpa
			String m = a[0].substring(0,4);						// getting the batch (1st 4 digits, say 2018 batch for example)

			if(batchtoBatchObj.containsKey(m)) {
				batchtoBatchObj.put(m,batchtoBatchObj.get(m));
			}
			else if(!batchtoBatchObj.containsKey(m)) {
				Batch nb = new Batch(m);
				batchtoBatchObj.put(m,nb);						// Adding the new batch to HASHMAP 2		
			}
			
			if(!IDtoStudentObj.containsKey(a[0])) {
				Student obj = new Student(a[0],a[1]);
				obj.addGPA(f,h);
				IDtoStudentObj.put(a[0],obj);					// adding to HASHMAP 1

				Batch z = batchtoBatchObj.get(m);				// We get the req batch from its key(y)
				z.addStudenttoBatch(obj);						// adding student to his batch	
			}
			else {
				Student st = IDtoStudentObj.get(a[0]);
				st.addGPA(f,h);
				}
		}
		br.close();
		return count;
	}
	int getStudentSize() {
		return IDtoStudentObj.size();
	}
	int getBatchSize() {
		return batchtoBatchObj.size();
	}

	void answerQueries(String inputfile, String outputfile) throws IOException,FileNotFoundException {
		BufferedReader fr = new BufferedReader(new FileReader(inputfile));
		BufferedWriter br = new BufferedWriter(new FileWriter(outputfile));

		/* This file would give marks even if just FileWriter is used (without BufferedWriter wrapping it), but it is a good practice to always
		 use BufferedWriter outside as it results in lesser number of calls to the file thereby improving the efficiency */

		String line;
		while((line=fr.readLine())!=null) {
			String a[] = line.split(" ");
			if(a[0].contentEquals("Q1")) {
				Student zz = IDtoStudentObj.get(a[1]);			// get the student
				
				br.write(zz.studentInfo());
				
			}
			else if(a[0].contentEquals("Q2")) {
				Batch zz = batchtoBatchObj.get(a[1]);			//get batch object
				for(int i=0;i<zz.getBatchSize();i++) {
					Student rr = zz.allStudents().get(i);
					
					br.write(rr.studentInfo());
				}
			}
			else if(a[0].equals("Q3")) {
				Batch zz = batchtoBatchObj.get(a[1]);			//get batch object
				zz.sortByID();
				for(int i=0;i<zz.getBatchSize();i++) {
					Student rr = zz.allStudents().get(i);
					
					br.write(rr.studentInfo());
				}
			}
			else if(a[0].equals("Q4")) {
				Batch zz = batchtoBatchObj.get(a[1]);			//get batch object
				zz.sortByCGPA();
				for(int i=0;i<zz.getBatchSize();i++) {
					Student rr = zz.allStudents().get(i);
					
					br.write(rr.studentInfo());
				}
			}
			else if(a[0].equals("Q5")) {
				Batch zz = batchtoBatchObj.get(a[1]);			//get batch object
				Student r = zz.findMaxCGPA(a[2]);
				br.write(r.studentInfo());
			}
		}
		fr.close();
		br.close();
	}	

}