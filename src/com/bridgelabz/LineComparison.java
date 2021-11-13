package com.bridgelabz;

public class LineComparison {
	public static void main(String[] args) {
		double x1=5,x2=6,y1=4,y2=5;
		double x3=6,x4=7,y3=5,y4=7;
		double LENGTH_OF_LINE1,LENGTH_OF_LINE2;
		LENGTH_OF_LINE1 = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
		LENGTH_OF_LINE2 = Math.sqrt(Math.pow((x4-x3),2) + Math.pow((y4-y3),2));
		System.out.println("length of the line 1 : " +LENGTH_OF_LINE1);
		System.out.println("length of the line 2 : " +LENGTH_OF_LINE2);
		if(LENGTH_OF_LINE1 == LENGTH_OF_LINE2) {
			System.out.println("Length is Equal");
		}
		else {
			System.out.println("Length is not Equal");
		}
	}
}
