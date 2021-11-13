package com.bridgelabz;

public class LineComparison {
	double x1=5,x2=6,y1=4,y2=5;
	double x3=6,x4=7,y3=5,y4=7;
	double LENGTH_OF_LINE1,LENGTH_OF_LINE2;
	public void length() {
		LENGTH_OF_LINE1= Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		LENGTH_OF_LINE2= Math.sqrt(Math.pow((x4-x3),2)+Math.pow((y4-y3),2));
		System.out.println("Length of Line 1 :" +LENGTH_OF_LINE1);
		System.out.println("Length of Line 2 :" +LENGTH_OF_LINE2);
	}
	public void checkLine() {
		boolean EQUAL = (LENGTH_OF_LINE1==LENGTH_OF_LINE2);
		System.out.println("Is it Equal :" +EQUAL);
		int line = Double.compare(LENGTH_OF_LINE1,LENGTH_OF_LINE2);
		if(line == 1) {
			System.out.println("Line1 is Greater than Line2 ");
		}
		else {
			System.out.println("Line1 is Less than Line2");
		}
	}
	public static void main(String[] args) {
		LineComparison lc = new LineComparison();
		lc.length();
		lc.checkLine();
	}
}