package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int n;
		int m;
		int j;
		double a;
		double b;
		double s;
		double x;
		double y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   n = Integer.parseInt(tempVar2);
		   }
		   a = 2.000;
		   b = 1.000;
		   s = 0;
		   for (j = 0;j < n;j++)
		   {
			  s = s + (double)(a / b);
			  x = a;
			  y = a + b;
			  b = x;
			  a = y;
		   }
		   System.out.printf("%.3lf\n",s);
		}
	}

}

