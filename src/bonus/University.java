package bonus;

/*
 * We wish to create a University class. A University is a School, and should inherit
 * from the School class from the previous problem. The main difference between a University and
 * a School is that universities have the ability to grant degrees, and wish to keep track of how many
 * degrees have been granted. Your University class should include an instance variable to track how
 * many degrees have been granted by the institution.
 * 
 * The beginnings of this class have been provided to you below. Examine the instructions and complete
 * what remains.
 *
 */
public class University extends School {

	//put your instance variable here
	private int degreesGranted;
	
	// Write the constructor for the University class
	// When a University is first created, the number of degrees it has granted is zero.
	public University(String name) {
		super(name);
		this.degreesGranted = 0;
	}
	/*
	* If the given Student is enrolled at this university and has more than 120 credits,
	* the student is removed from the list of enrolleed students and the number of
	* granted degrees goes up by one.
	*/
	public void graduate ( Student s) {
		if(isEnrolled(s) && s.getTotalPassingCredits() >= 120) {
			this.degreesGranted++;
			this.remove(s);
		}
	}
	
	// Returns a String containing the name of the university as well as
	// the number of degrees it has granted.
	public String toString () {
		return this.getName() + this.degreesGranted;
	}
}
