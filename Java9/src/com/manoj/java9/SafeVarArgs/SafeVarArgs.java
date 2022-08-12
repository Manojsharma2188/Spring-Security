package com.manoj.java9.SafeVarArgs;

import java.util.ArrayList;  
import java.util.List;  
public class SafeVarArgs{  
    // Applying @SaveVarargs annotation  
    @SafeVarargs  
    private void display(List<String>... products) { // Not using @SaveVarargs  
        for (List<String> product : products) {  
            System.out.println(product);  
        }  
    }  
    public static void main(String[] args) {  
        SafeVarArgs p = new SafeVarArgs();  
        List<String> list = new ArrayList<String>();  
        list.add("Laptop");  
        list.add("Tablet");  
        p.display(list);  
    }     
}  