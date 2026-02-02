package exam.codewriting.q5;

public class Computer {

	/*
	 * We wish to create a Computer class. Specifically, we are interested in keeping track of the state of the computer, i.e. whether the computer is on, off, or in sleep mode. For this problem, you have already been provided with the necessary instance variables for the Computer class.

		Complete each item of the implementation of the class in the designated areas. Use appropriate names, data types, and modifiers based on the story above:
	 */
	
	// Instance variables - do not change
    private boolean isOn; // true if on, false if off
    private boolean isAsleep; // true if in sleep mode, false otherwise
    
    // Write the constructor for the Computer class. 
    // When a computer is created it should be completely off.
    
    
    
    
    
    /**
     * If the button press is short, the computer should go to sleep (but remain on),
     * or if it is asleep it should wake up.
     * If the button press is long, then the computer should turn off
     * unless it is already off, then it should turn on.
     
     * @param longPress true if the button press was long, false if it is short
     */
    public void pushPowerButton(boolean longPress) {
    	//FIXME
    }
    
    // getters and setters
    public boolean isOn() {
        return this.isOn;
    }

    public boolean isAsleep() {
        return this.isAsleep;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }

    public void setAsleep(boolean isAsleep) {
        this.isAsleep = isAsleep;
    }
    
    
    
}
