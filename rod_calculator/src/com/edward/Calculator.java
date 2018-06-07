package com.edward;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Calculator {
	
	ArrayList<Float> rods;
	float length;
	int minimum_num;
	
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		Calculator c = new Calculator();
	}
	
	public Calculator() throws NumberFormatException, IOException
	{
		rods = new ArrayList<Float>();
		//this.inputRods();	
		
		
		
		
		rods.add(3.0f);
		rods.add(3.0f);
		for(int i =0;i<10;i++)
		{
			rods.add(2.0f);

		}


		length=7.0f;
		minimum_num=6;
		this.recursion(rods, 0,rods.size()-1);
		
	}
	
	public void inputRods() throws NumberFormatException, IOException
	{
		System.out.println("please input the length of the rods");			
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);	
		try {
			length=Float.parseFloat(br.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(length);
		
		int i = 0;
		float len = 0;
		int num = 0;
		
		while(true)
		{
			i++;
			System.out.println("please input the "+ i +" length of the rods required");			
			len=Float.parseFloat(br.readLine());
			System.out.println("please input the number of the rods required with the length of "+len);
			num = Integer.parseInt(br.readLine());
			for(int j=0;j<num;j++)
			{
				rods.add(len);
			}
			System.out.println("is there any more required rods?(Y/N)");
			String con = br.readLine();
			if(con.equals("N"))
			{
				break;
			}
			else if(con.equals("Y"))
			{
				System.out.println("Let's continue");
			}
			else
			{
				System.out.println("Error");
			}
			
				
			
		}
		minimum_num=rods.size();
		
	}
	
	public void calculateLength()
	{
		
		
	}
	
	
	public void recursion(ArrayList<Float> array, int k, int m) {
        if (k == m) {
        	
        	String result="";
        	
        	
        	int used_rod_number=1;
        	float remaining=length;
            for (int i = 0; i < array.size(); i++)
            {
            	result=result+array.get(i)+" ";
            	while(true)
            	{
            		if(remaining>=array.get(i))
                	{
                		remaining=remaining-array.get(i);
                		break;
                	}
            		else
            		{
            			used_rod_number++;
            			remaining=length;
            		}
            	}
            	
            	
            }
            
            result=result+"|"+used_rod_number;
            
            if(used_rod_number<minimum_num)
            {
            	System.out.println(result);
            	minimum_num=used_rod_number;
            }
            
            
            
        } else {
            for (int i = k; i <= m; i++)
            {   
            	
            	Swap(array, k, i);
                recursion(array, k + 1, m);
                Swap(array, k, i);
            	
                
               
            }
        }
        
    }
    public void Swap(ArrayList<Float> array, int i, int j) {
        float temp = array.get(i);
        array.set(i, array.get(j));
        array.set(j, temp);
    }

}


