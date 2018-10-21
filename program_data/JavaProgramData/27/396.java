package <missing>;

public class GlobalMembers
{
	/**
	 * @file    1.cpp              
	 * @author  ??? 1100013230               
	 * @date    2011-9-16         
	 * @descrption        
	 *          ???????????????          
	*/
	public static int Main()
	{
		int n;
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 for (n = 1;n <= k;n = n + 1)
		 {
			 float a; //a?b?c?????????????????????
			 float b;
			 float c;
			 double x1; //x1?x2????????????x11,x22??????????
			 double x2;
			 double x11;
			 double x22;
			  a = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			  b = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			  c = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			 if ((b * b - 4 * a * c) > 0) //??b*b-4*a*c?0???
			 {
				 x1 = (0 - b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				 x2 = (0 - b - Math.sqrt(b * b - 4 * a * c)) / (2 * a); //????
				 System.out.printf("%f", "x1=");
				 System.out.printf("%.5f", x1);
				 System.out.printf("%.5f", ";");
				 System.out.printf("%.5f", "x2=");
				 System.out.printf("%.5f", x2);
				 System.out.printf("%.5f", "\n");
			 }
			 else
			 {
				 if ((b * b - 4 * a * c) < 0) //??b*b-4*a*c?0???
				 {
					 x1 = x2 = (0 - b) / (2 * a);
					 x11 = Math.sqrt(-b * b + 4 * a * c) / (2 * a);
					 x22 = -Math.sqrt(-b * b + 4 * a * c) / (2 * a); //????
					 System.out.printf("%.5f", "x1=");
					 System.out.printf("%.5f", x1);
					 System.out.printf("%.5f", "+");
					 System.out.printf("%.5f", x11);
					 System.out.printf("%.5f", "i");
					 System.out.printf("%.5f", ";");
					 System.out.printf("%.5f", "x2=");
					 System.out.printf("%.5f", x2);
					 System.out.printf("%.5f", x22);
					 System.out.printf("%.5f", "i");
					 System.out.printf("%.5f", "\n");
				 } //?????????????
				 else
				 {
				   x1 = x2 = (0 - b + Math.sqrt(b * b - 4 * a * c)) / (2 * a); //????
				   System.out.printf("%.5f", "x1=x2=");
				   System.out.printf("%.5f", x1);
				   System.out.printf("%.5f", "\n");
				 }
			 }
		 }
		 return 0;
	}
}

