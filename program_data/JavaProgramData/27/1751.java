package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double a;
		double b;
		double c;
		double d;
		double e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
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
						 d = b * b - 4 * a * c;
						 e = (-b) / (2 * a);
						 if (d > 0)
						 {
							  System.out.printf("x1=%.5lf;x2=%.5lf\n",(e + (Math.sqrt(d) / (2 * a))),(e - (Math.sqrt(d) / (2 * a))));
						 }
						 else if (d < 0)
						 {
							  if (e != 0)
							  {
	System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",e,(Math.sqrt(-d) / (2 * a)),e,(Math.sqrt(-d) / (2 * a)));
							  }
	else
	{
		System.out.printf("x1=0.00000+%.5lfi;x2=0.00000-%.5lfi\n",(Math.sqrt(-d) / (2 * a)),(Math.sqrt(-d) / (2 * a)));
	}
						 }
						 else
						 {
							  if (e == 0)
							  {
	System.out.print("x1=x2=0.00000");
							  }
	else
	{
	System.out.printf("x1=x2=%.5lf\n",e);
	}
						 }
		}

		return 0;
	}

}

