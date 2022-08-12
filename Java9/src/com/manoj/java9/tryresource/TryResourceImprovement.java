package com.manoj.java9.tryresource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TryResourceImprovement {

	public static void main(String[] args) throws FileNotFoundException { 
        FileOutputStream fileStream=new FileOutputStream("javatpoint.txt");  
        // Allowed in jdk11 to pass obj in try block
        try(fileStream){  
             String greeting = "Welcome to javaTpoint.";      
                byte b[] = greeting.getBytes();       
                fileStream.write(b);      
                System.out.println("File written");           
        }catch(Exception e) {  
            System.out.println(e);  
        }         
	}

}
