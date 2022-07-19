package com.srt.project.app;

import java.util.Scanner;

import com.srt.project.customer.CustomerDAO;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	do {
    		System.out.println("1. Customer Service");
    		System.out.println("2. Contact Service");
    		//....
    		
    		System.out.println("0. Exit");
    		System.out.println("Enter your option");
    		int option = Integer.parseInt(sc.nextLine());
    		
    		if(option==1) {
    		
    		}else if(option==2) {
    			
    		}//....
    		
    	}while(true);
    }
}
