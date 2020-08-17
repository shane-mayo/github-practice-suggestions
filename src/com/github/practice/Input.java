package com.github.practice;

/**
 * 
 * @author Shane Mayo
 * Date: 8-11-2020
 * 
 * The Input interface allows for loose coupling between the various classes that require user input. 
 * Utilizing an implementation class for a middle man, so to speak, allows for customization depending on the 
 * needs of the class that utilizes it.
 * 
 */

public interface Input {
	
	public long getUserInput();
}
