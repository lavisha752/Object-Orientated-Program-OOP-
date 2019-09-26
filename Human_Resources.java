import java.util.Scanner;
/**
 * 
 */

/**
 * @author lavish
 *
 */
public class Human_Resources {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nid,name,sid,course,responsibleParty,speciality,academia;
		double weight, height,hoursWorked,rate;
		
		Scanner myKeyboard=new Scanner (System.in);
		
		System.out.println("Please enter student NID: ");
		nid=myKeyboard.next();
		System.out.println("Please enter student name: ");
		name=myKeyboard.next();
		System.out.println("Please enter student height: ");
		height=myKeyboard.nextInt();
		System.out.println("Please enter student weight: ");
		weight=myKeyboard.nextInt();
		System.out.println("Please enter student Sid: ");
		sid=myKeyboard.next();
		System.out.println("Please enter student course: ");
		course=myKeyboard.next();
		System.out.println("Please enter student responsible party: ");
		responsibleParty = myKeyboard.next();
		
		student1 Tina = new student1(nid,name,height,weight,sid,course,responsibleParty);
		System.out.println(Tina.toString());
		
		/**************************************************/
		System.out.println("Please enter Lecturer NID:");
		nid=myKeyboard.next();
		System.out.println("Please enter Lecturer name:");
		name=myKeyboard.next();
		System.out.println("Please enter Lecturer height:");
		height=myKeyboard.nextInt();
		System.out.println("Please enter Lecturer weight:");
		weight=myKeyboard.nextInt();
		System.out.println("Please enter Lecturer speciality:");
		speciality=myKeyboard.next();
		System.out.println("Please enter Lecturer academia:");
		academia=myKeyboard.next();
		System.out.println("Please enter Lecturer hours Worked:");
	    hoursWorked=myKeyboard.nextInt();
	    System.out.println("Please enter Lecturer rate:");
		rate=myKeyboard.nextInt();
		
		Lecturer MrZoubeir = new Lecturer (nid,name, height,weight, speciality,academia,hoursWorked,rate);
		System.out.println(MrZoubeir.toString());
		
		System.out.println("Salary of MR Zoubeir is: "+MrZoubeir.calculateSalary(10, 1000));
		
		
		
		
		
	
		
	

	}

}
