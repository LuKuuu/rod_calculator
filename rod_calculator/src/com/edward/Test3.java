package com.edward;
import java.util.*;
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test3 test=new Test3();
		ArrayList a= new ArrayList();
		a.add(0,1);
		a.add(1,2);
		a.add(2,3);
		
		test.printArray(a);
		

		
		a.add(0,4);
		a.
		test.printArray(a);
	}

	
	public void printArray(ArrayList array)
	{
		for(int i=0;i<array.size();i++)
		{
			System.out.print(array.get(i)+" ");
		}
		System.out.println();
	}
}
