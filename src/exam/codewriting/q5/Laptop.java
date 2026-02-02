package exam.codewriting.q5;

public class Laptop {

	/*
	 * We wish to create a Laptop class. A Laptop is a Computer, and should inherit from the Computer class from the previous problem. The main difference between a Laptop and a Computer is that laptops have the ability to open and close. This can affect the state of the computer (whether it is asleep or not) as well as whether the button is able to be pressed. Your Laptop class should include an instance variable to track whether the laptop is currently open or not.

		The beginnings of this class have been provided to you below. Examine the instructions and complete what remains.
	 */
	
	//Put your instance variable here:
	
	
	
    // %Write the constructor for the \texttt{Laptop} class.
	// %When a \texttt{Laptop} is first created, it should be closed.

	
	
	
	// Should put the laptop to sleep, if it is on
	public void close() {
	
	}
	
	// Should wake the laptop up, if it is on
	public void open() {
		
	}
	
	/* 
	* Should do nothing if the laptop is closed (button cannot be pushed)
	* If the laptop is open, should simply call the pushPowerButton() method
	* from the base class. 
	*/
	public void pushPowerButton(boolean longPress) {
	
	}
}
