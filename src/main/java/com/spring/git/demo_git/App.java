package com.spring.git.demo_git;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public void addData(String data) {
		if(data.equalsIgnoreCase(Constant.DATA_TYPE)) {
			System.out.println("Welcome Mr Meher");
		}
	}
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
