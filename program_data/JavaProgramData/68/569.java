package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		 int m;
		 int n;
		 int a;
		 int b;
		 int i;
		 int j;
		 int s;
		 double t;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 for (m = 6;m <= n;m += 2)
		 {
						   for (a = 3;a < m;a += 2)
						   {
											s = 1;
											t = Math.sqrt(a);
											for (i = 3;i <= t;i++)
											{
																   if ((a % i) == 0)
																   {
																   s = 0;
																   break;
																   }
											}
																   if (s == 1)
																   {
																		   b = m - a;
																		   t = Math.sqrt(b);
																		   for (j = 3;j <= t;j++)
																		   {
																								  if ((b % j) == 0)
																								  {
																								  s = 0;
																								  break;
																								  }
																		   }
																   }
																								  if (s == 1)
																								  {
																										  System.out.printf("%ld=%ld+%ld\n",m,a,b);
																										  break;
																								  }
						   }
		 }

	}

}

