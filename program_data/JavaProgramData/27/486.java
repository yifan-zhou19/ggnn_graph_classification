package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double a1;
		double a2;
		  int n;
		  int d;
		  d = 1;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  while (d <= n)
		  {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a = Double.parseDouble(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   b = Double.parseDouble(tempVar3);
		   }
		   String tempVar4 = ConsoleInput.scanfRead(" ");
		   if (tempVar4 != null)
		   {
			   c = Double.parseDouble(tempVar4);
		   }
		   a1 = -b / (2 * a);
		   if (a1 == 0)
		   {
		   a1 = 0;
		   }
		   else
		   {
			   a1 = -b / (2 * a);
		   }
		   if ((b * b - 4 * a * c) == 0)
		   {
			  a2 = 0;
		  System.out.printf("x1=x2=%.5lf\n",a1);
		   }
		   else if ((b * b - 4 * a * c) < 0)
		   {
			  a2 = (Math.sqrt(4 * a * c - b * b)) / (2 * a);
		   System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",a1,a2,a1,a2);
		   }
		  else if ((b * b - 4 * a * c) > 0)
		  {
			  a2 = (Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		  System.out.printf("x1=%.5lf;x2=%.5lf\n",a1 + a2,a1 - a2);
		  }
		  d = d + 1;
		  }
	}
}

