package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
	  float a;
	  float b;
	  float c;
	  float d;
	  float j;
	  float k;
	  double x1;
	  double x2;
	  char i;
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  d = 1F;
	  i = 'i';
	  for (d = 1F;d <= n;d = d + 1)
	  {
	   a = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
	   b = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
	   c = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
	   if (b * b - 4 * a * c > 0F)
	   {
		x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				 x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				 System.out.printf("%.5f", "x1=");
				 System.out.printf("%.5f", x1);
				 System.out.printf("%.5f", ";x2=");
				 System.out.printf("%.5f", x2);
				 System.out.printf("%.5f", "\n");
	   }
		  if (b * b - 4 * a * c == 0F)
		  {
		   if (b == 0F)
		   {
			x1 = (b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			System.out.printf("%.5f", "x1=x2=");
			System.out.printf("%.5f", x1);
			System.out.printf("%.5f", "\n");
		   }
		   else
		   {
			x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			System.out.printf("%.5f", "x1=x2=");
			System.out.printf("%.5f", x1);
			System.out.printf("%.5f", "\n");
		   }
		  }
		  if (b * b - 4 * a * c < 0F)
		  {
		   if (b == 0F)
		   {

		   j = 0F;
		   k = Math.sqrt(4 * a * c - b * b) / (2 * a);
			  System.out.printf("%.5f", "x1=");
			  System.out.printf("%.5f", j);
			  System.out.printf("%.5f", "+");
			  System.out.printf("%.5f", k);
			  System.out.printf("%.5f", i);
			  System.out.printf("%.5f", ";x2=");
			  System.out.printf("%.5f", j);
			  System.out.printf("%.5f", "-");
			  System.out.printf("%.5f", k);
			  System.out.printf("%.5f", i);
			  System.out.printf("%.5f", "\n");
		   }
		   else
		   {
			j = -b / (2 * a);
			k = Math.sqrt(4 * a * c - b * b) / (2 * a);
			   System.out.printf("%.5f", "x1=");
			   System.out.printf("%.5f", j);
			   System.out.printf("%.5f", "+");
			   System.out.printf("%.5f", k);
			   System.out.printf("%.5f", i);
			   System.out.printf("%.5f", ";x2=");
			   System.out.printf("%.5f", j);
			   System.out.printf("%.5f", "-");
			   System.out.printf("%.5f", k);
			   System.out.printf("%.5f", i);
			   System.out.printf("%.5f", "\n");
		   }
		  }
	  }
	 return 0;
	}

}

