package <missing>;

public class GlobalMembers
{
	/*
	 * ?????????.cpp
	 *?????????
	 *  Created on: 2012-10-12
	 *      Author: ???
	 */
	public static int Main()
	{
	 int n;
	 int i;
	 float a;
	 float b;
	 float c;
	 double d; //????
	 double e;
	 double f;
	 double x1;
	 double x2;
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 for (i = n;i >= 1;i--) //??????
	 {
	 a = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
	 b = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
	 c = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
	 d = b * b - 4 * a * c; //?????
	 if (d > 0) //??????
	 {
		 x1 = (0 - b + Math.sqrt(d)) / (2 * a);
		 x2 = (0 - b - Math.sqrt(d)) / (2 * a); //?????
		 System.out.printf("%.5f", "x1=");
		 System.out.printf("%.5f", x1);
		 System.out.printf("%.5f", ';');
		 System.out.printf("%.5f", "x2=");
		 System.out.printf("%.5f", x2);
		 System.out.printf("%.5f", "\n");
	 }
	 if (d == 0) //??????
	 {
		  x1 = (0 - b) / (2 * a);
		  System.out.printf("%.5f", "x1=x2=");
		  System.out.printf("%.5f", x1);
		  System.out.printf("%.5f", "\n");
	 }
	 if (d < 0) //??????
	 {
			e = (Math.sqrt(-d)) / (2 * a);
			f = (0 - b) / (2 * a);
			System.out.printf("%.5f", "x1=");
			System.out.printf("%.5f", f);
			System.out.printf("%.5f", "+");
			System.out.printf("%.5f", e);
			System.out.printf("%.5f", "i");
			System.out.printf("%.5f", ";");
			System.out.printf("%.5f", "x2=");
			System.out.printf("%.5f", f);
			System.out.printf("%.5f", -e);
			System.out.printf("%.5f", "i");
			System.out.printf("%.5f", "\n");
	 }
	 }
	 return 0;
	} //????

}

