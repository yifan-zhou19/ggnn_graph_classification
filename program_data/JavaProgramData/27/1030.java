package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double i;
		double n;
		double x1;
		double x2;
		float a;
		float b;
		float c;
		float x;
		float y;
		n = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
		a = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		b = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		c = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		 if (b == 0F)
		 {
		 if ((b * b - 4 * a * c) > 0)
		 {
		x1 = (b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		  x2 = (b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

		  System.out.printf("x1=%.5f;",x1);
		  System.out.printf("x2=%.5f\n",x2);
		 }
		  else if ((b * b - 4 * a * c) == 0)
		  {
		x1 = (b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		  x2 = (b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		  System.out.printf("x1=x2=%.5f\n",x1);
		  }
		  else
		  {
		  x = (b / (2 * a));
		  y = (Math.sqrt(-b * b + 4 * a * c)) / (2 * a);
		  System.out.printf("x1=%.5f+%.5fi;",x,y);
		  System.out.printf("x2=%.5f-%.5fi\n",x,y);
		  }
		 }
		 else
		 {
		 if ((b * b - 4 * a * c) > 0)
		 {
		x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		  x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

		  System.out.printf("x1=%.5f;",x1);
		  System.out.printf("x2=%.5f\n",x2);
		 }
		  else if ((b * b - 4 * a * c) == 0)
		  {
		x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		  x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		  System.out.printf("x1=x2=%.5f\n",x1);
		  }
		  else
		  {
		  x = (-b / (2 * a));
		  y = (Math.sqrt(-b * b + 4 * a * c)) / (2 * a);
		  System.out.printf("x1=%.5f+%.5fi;",x,y);
		  System.out.printf("x2=%.5f-%.5fi\n",x,y);
		  }
		 }
		}
		   return 0;
	}
}

