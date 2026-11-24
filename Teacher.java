package StudentTeacherDemo;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Teacher {

	public static void main(String[] args) {

	try (Scanner myScanner = new Scanner(System.in);
	FileWriter myWriter = new FileWriter("StudentTeacher.txt",true)){
	
	System.out.print("Enter The Name: ");
	String name = myScanner.nextLine();
	
	System.out.print("Enter the grade: ");
	double grade = myScanner.nextDouble();
	
	myWriter.write("Name: "+ name + "\n");
	myWriter.write("Grade: "+ grade + "\n");
 
	}catch (FileNotFoundException e) {
		System.out.println("ERROR: " + e.getMessage());
	}catch (IOException ex) {
		System.out.println(ex.getMessage());
	}finally {
		System.out.println(" Na Save Muna Boi");
		
	   }
	}
}
