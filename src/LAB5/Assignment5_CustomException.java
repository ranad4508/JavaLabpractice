/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB5;

// A Class that represents use-defined exception

class MyException extends Exception {
	public MyException(String s)
	{
		// Call constructor of parent Exception
		super(s);
	}
}

// A Class that uses above MyException
public class Assignment5_CustomException {
	// Driver Program
	public static void main(String args[])
	{
		try {
			// Throw an object of user defined exception
			throw new MyException("There is error in code");
		}
		catch (MyException ex) {
			System.out.println("Caught the error");

			// Print the message from MyException object
			System.out.println(ex.getMessage());
		}
	}
}

