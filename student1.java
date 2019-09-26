/**
 * 
 */

/**
 * @author lavish
 *
 */
public class student1 extends person1 {
	//define attributes
	private String sid;
	private String  course;
	private String responsibleParty;

	/**
	 *  default constructors
	 */
	public student1() {
		super();//calling the default constructors of the person class
		// TODO Auto-generated constructor stub
		this.sid=null;
		this.course=null;
		this.responsibleParty=null;
		
	}

	/**
	 *  7 overloaded constructor
	 * @param nid of student
	 * @param name of student
	 * @param height of student
	 * @param weight of student
	 * @param sid of student
	 * @param course of student
	 * @param responsibleParty of student
	 */
	 
	public student1(String nid, String name, double height, double weight,String sid, String course,String responsibleParty) {
		super(nid, name, height, weight);
		// TODO Auto-generated constructor stub
		this.sid=sid;
		this.course=course;
		this.responsibleParty=responsibleParty;
		
	}
	
	

	/**
	 * @return the sid
	 */
	public String getSid() {
		return sid;
	}

	/**
	 * @return the course
	 */
	public String getCourse() {
		return course;
	}

	/**
	 * @return the responsibleParty
	 */
	public String getResponsibleParty() {
		return responsibleParty;
	}

	/**
	 * @param sid the sid to set
	 */
	public void setSid(String sid) {
		this.sid = sid;
	}

	/**
	 * @param course the course to set
	 */
	public void setCourse(String course) {
		this.course = course;
	}

	/**
	 * @param responsibleParty the responsibleParty to set
	 */
	public void setResponsibleParty(String responsibleParty) {
		this.responsibleParty = responsibleParty;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "This is a student with national ID" + super.getNid()+"This is a student with Name"+super.getName() + "This is a student with weight"+super.getWeight() +"This is a student with height"+ super.getHeight()+"This is a student with Sid" +this.sid  + "This is a student with course"+this.getCourse()+"This is a student with responsibility " + this.responsibleParty;
		}

	@Override
	public double calculateSalary(double hoursWorked, double rate) {
		// TODO Auto-generated method stub
		return 0.0;
	}

}
