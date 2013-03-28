package com.okada;
import java.util.UUID;

/**
 * Hello world!
 *
 */
public class App 
{
    
    public static void main( String[] args )
    {
        App obj = new App();
        System.out.println("Unique ID : " + obj.generateUniqueKey());
        System.out.println( "Hello World!" );
    }
 
    public String generateUniqueKey(){
 
    	String id = UUID.randomUUID().toString();
    	return id;
 
    }


}
