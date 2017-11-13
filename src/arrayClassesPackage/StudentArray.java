package arrayClassesPackage;

import javax.swing.JOptionPane;

public class StudentArray {
	
	String msg;
	Boolean running = true;
	
	Student[] myStudents = new Student[10];

	public void buildArray() {
		
		while (running == true) {
		
		msg = "What is your animals Breed?";
		String breedA = JOptionPane.showInputDialog(null, msg);
		
		msg = "What is your animals gender?";
		String genderA = JOptionPane.showInputDialog(null, msg);
		
		msg = "What is your animals age?";
		int age = Integer.parseInt(JOptionPane.showInputDialog(null, msg));
		
		msg = "What is your animals symptoms?";
		String symptomsA = JOptionPane.showInputDialog(null, msg);
		
		
		
		myStudents[0] = new Student();
		myStudents[0].setbreed(breedA);
		myStudents[0].setgender(genderA);
		myStudents[0].setage(age);
		myStudents[0].setsymptoms(symptomsA);
		
		myStudents[1] = new Student();
		myStudents[2] = new Student();
		myStudents[3] = new Student();
		myStudents[4] = new Student();
		myStudents[5] = new Student();
		myStudents[6] = new Student();
		myStudents[7] = new Student();
		myStudents[8] = new Student();
		myStudents[9] = new Student();
		
		
		
		}
		
	}

	public void showArray() {
		
		
		for (int s = 0; s < myStudents.length; s++) {
		System.out.println(" Breed: " + myStudents[s].getbreed());
		System.out.println(" Gender: " + myStudents[s].getgender());
		System.out.println(" Age: " + myStudents[s].getage());
		System.out.println(" symptoms: " + myStudents[s].getsymptoms());
		System.out.println("");
		
		}
		
	}

}
