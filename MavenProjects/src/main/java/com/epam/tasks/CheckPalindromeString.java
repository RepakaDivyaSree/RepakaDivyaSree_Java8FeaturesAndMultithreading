/**
 * 
 */
package com.epam.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @author Divya sree
 *
 */
public class CheckPalindromeString {

	public static boolean isPalindrome(String oog) {
		String temp= oog.replaceAll("\\s+", "").toLowerCase();
		return IntStream.range(0, temp.length()/2).noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length()-i-1));
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		List<String> strList=new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			strList.add(scanner.next());
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println(strList.get(i)+" "+isPalindrome(strList.get(i)));
		}
	}

}
