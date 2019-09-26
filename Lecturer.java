/**
 * 
 */

/**
 * @author lavish
 *
 */
public class Lecturer extends person1 {
	//define attribute
	private String speciality;
	private String  academia;
	private double hoursWorked;
	private double rate;

	/**
	 * default constructors
	 */
	
	public Lecturer() {
		// TODO Auto-generated constructor stub
		super();//calling the default constructors of the person class
		this.speciality=null;
		this.academia=null;
		this.hoursWorked=0.0;
		this.rate=0.0;
		}

	/**
	 * 7 overloaded constructors
	 * @param nid of lecturer
	 * @param name of lecturer
	 * @param height of lecturer
	 * @param weight of lecturer
	 * @param speciality of lecturer
	 * @param academia of lecturer
	 * @param hoursWorked of lecturer
	 * @param rate of lecturer
	 * */
	 
	public Lecturer(String nid, String name, double height, double weight,String speciality,String academia,double hoursWorked , double rate) {
		super(nid, name, height, weight);
		// TODO Auto-generated constructor stub
		this.speciality=speciality;
		this.academia=academia;
		this.hoursWorked=hoursWorked;
		this.rate=rate;
		
	}
	

	/**
	 * @return the speciality
	 */
	public String getSpeciality() {
		return speciality;
	}

	/**
	 * @return the academia
	 */
	public String getAcademia() {
		return academia;
	}

	/**
	 * @return the hoursWorked
	 */
	public double getHoursWorked() {
		return hoursWorked;
	}

	/**
	 * @return the rate
	 */
	public double getRate() {
		return rate;
	}

	/**
	 * @param speciality the speciality to set
	 */
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	/**
	 * @param academia the academia to set
	 */
	public void setAcademia(String academia) {
		this.academia = academia;
	}

	/**
	 * @param hoursWorked the hoursWorked to set
	 */
	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	/**
	 * @param rate the rate to set
	 */
	public void setRate(double rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return "This is a lecturer with national ID "+super.getNid()+"The name of the lecturer is "+super.getName() +"The weight of the lecturer is "+ super.getWeight()+ "The height of the lecturer is "+super.getHeight()
		+ "The speciality of the lecturer is " + this.getSpeciality()+"The academia of the lecturer is "+this.getAcademia ()+"The hours worked of the lecturer is "
		+this.getHoursWorked()+"The rate of the lecturer is " + this.rate;}

	@Override
	
	public double calculateSalary(double hoursWorked, double rate) {
		// TODO Auto-generated method stub
		return ((hoursWorked*rate)-(15/100));
	}

}
