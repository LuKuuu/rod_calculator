package com.edward;
/*
 * test of recursion
 */
import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub(
		
		Test test= new Test();
		test.factorial(20);

	}
	
	public void factorial(int i)
	{
		this.recursion(i, 1);
	}
	
	private void recursion(int i, long result)
	{
		result= result*i;
		i--;
		if(i==0)
		{
			System.out.println(result);
		}
		else
		{
			recursion(i, result);
		}
		
	}

}
