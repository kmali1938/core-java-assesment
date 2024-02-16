package com.emp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of employees : ");
		int n = sc.nextInt();
		
		Employee[] emparr = new Employee[n];
		
		for(int i=0;i<emparr.length;i++) {
			try {
				
				System.out.println("Enter Employee id for employee: "+(i+1));
				int empId = sc.nextInt();
				
				System.out.println("Enter Employee name : ");
				String empName = sc.next();
				System.out.println("Enter grade for the employee : ");
				String grade = sc.next();
				emparr[i] = new Employee(empId,empName,grade);
			}catch(InvalidGradeException ie) {
				i-=1;
				System.out.println("Invalid data provided");
			}
			
		}
		
		FileWriter fw = new FileWriter("/Users/kashmiramali/Desktop/Kashmira/Coding/emp.txt");
		for(Employee emp: emparr) {
			String details = emp.toString();
			fw.write(details + "\n");
		}
		fw.close();
		
		FileReader fr = new FileReader("/Users/kashmiramali/Desktop/Kashmira/Coding/emp.txt");
		BufferedReader bufferedReader = new BufferedReader(fr);
		String line;
		while ((line = bufferedReader.readLine()) != null) {
			System.out.println(line);
		}
		bufferedReader.close();
		

	}
}

