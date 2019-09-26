/**
 * 
 */

/**
 * @author lavish
 *
 */
public abstract class person1 {
	//attributes
	private String nid;
	private String name;
	private double height;
	private double weight;
	
	//default constructors
	
	/**
	 * 
	 */
	public person1() {
		// TODO Auto-generated constructor stub
		this.nid=null;
		this.name=null;
		this.weight=0.0;
		this.height=0.0;
	
	}
	/**
	 * 
	 * @param nid of person
	 * @param name of person
	 * @param height of person
	 * @param weight of person
	 */
	public person1(String nid,String name, double height, double weight) {
		 this.nid=nid;
		 this.name=name;
		 this.height=height;
		 this.weight=weight;
		 
	} 
	//Getters
	/**
	 * @return the nid
	 */
	public String getNid() {
		return nid;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}
	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}
	//Setters
	/**
	 * @param nid the nid to set
	 */
	public void setNid(String nid) {
		this.nid = nid;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	/**
	 * calculate BMI of person
	 * @return BMI
	 */
	public double calculateBmi() {
		return (this.weight/Math.pow(height/100, 2));
	} 
	//comparing 2 person objects
	/**
	 * a method to compare if two person object are the same based on their nid
	 * @param p  to compare if they are same
	 * @return if they are same person
	 */
	public boolean eqauls(person1 p) {
		 if(this.nid.equalsIgnoreCase(p.nid)) {
			 return true;
		 }
		 else {
			 return false;
		 }
	 }
	
	 @Override
	 public abstract String toString();
	 
	 /**
	  * 
	  * @param hoursWorked
	  * @param rate per hour
	  * @return salary per month
	  */
	 public abstract double calculateSalary(double hoursWorked, double rate);
	 

}
