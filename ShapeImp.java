package com.Interface;

public class ShapeImp implements Shape
{
    public void areaofsquare(int sites)
    {
    	int res=sites*sites;
    	
    	System.out.println(res);
    }
    
    public void perimetersquare(int sites)
    {
    	int res=4*sites;
    	
    	System.out.println(res);
    }
    
    public void areacircle(int rad)
    {
    	double res=PI_VALUES * rad*rad;
    	
    	System.out.println(res);
    }
    
    public static void message()
    {
 	   
 	   System.out.println("Bad  shape to  Calcualtor");
    }
}
