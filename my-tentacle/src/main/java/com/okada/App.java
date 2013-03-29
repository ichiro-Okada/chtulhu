package com.okada;
import java.io.File;
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
        
        App fp = new App(); 
        fp.palpate( fp.genStartDirectory() );
        System.out.println( "Buy World!" );
    }
 
    public String genStartDirectory(){
    	return "h:\\hmm_ost\\";
    }
    
    public String generateUniqueKey(){
 
    	String id = UUID.randomUUID().toString();
    	return id;
 
    }
    
    public void palpate ( String path ) { 

        File root = new File( path ); 
        File[] list = root.listFiles(); 

        for ( File f : list ) { 
            if ( f.isDirectory() ) { 
            	System.err.println( "Dir:" + f.getAbsoluteFile() ); 
            	palpate( f.getAbsolutePath() ); 
                
            } 
            else { 
                System.err.println( "File:" + f.getName() ); 
            } 
        } 
    } 


}
