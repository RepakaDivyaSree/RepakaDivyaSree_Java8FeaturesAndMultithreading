package com.epam.tasks;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;


/**
 * @author Divya sree
 * 
 */
public class ListOfStrings {
	
public static List<String> search(List<String> list)
{
return list.stream().filter(s -> s.startsWith("a")).filter(s -> s.length() == 3).collect(Collectors.toList());
}

/**
 * @param args
 */
public static void main(String args[])
{
	
	Scanner scanner=new Scanner(System.in);
	List<String> strings= new ArrayList<String>();
	int n=scanner.nextInt();
	for(int i=0;i<n;i++)
		strings.add(scanner.next());
	System.out.println(strings);
	System.out.print(search(strings));
	
	scanner.close();
}
}
