/**
 * 
 */
package com.epam.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;

/**
 * @author Divya sree
 * 
 */
public class ListAvgUsingStreams {

	public static double calcAvg(List<Integer> list)
	{
		
		return list.stream().mapToInt(i->i).average().getAsDouble();
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		List<Integer> numsList=new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			numsList.add(scanner.nextInt());
		}
		//System.out.print(numsList);
		
		System.out.println("The average of numbers in given list "+numsList+" is "+calcAvg(numsList));
		scanner.close();
	}

}
