package com.edward;

import java.util.*;

public class Test2 {
	int temp=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 test =new Test2();
		ArrayList array=new ArrayList();
		
		for(int i = 0; i <4;i++)
		{
			array.add(i+1);
		}
		
		
		test.arrangeArray(-1, array);

	}
	
	public void arrangeArray(int start, ArrayList array)
	{
		
		start++;
		if(array.size()-start==2)
		{
			
		}
		else
		{
			
			
			for(int i=start;i<array.size();i++)
			{
				temp=(int) array.get(start);
				array.set(start, array.get(i));
				array.set(i, temp);
				this.printArray(array);
				
				arrangeArray(start,array);
				
				
			}
		
		}
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
