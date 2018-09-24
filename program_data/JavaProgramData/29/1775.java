package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m = 0;
		int n;
		int k = 0;
		int x = 0;
		double sum = 0;
		double a = 2;
		double b = 1;
		double c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		while (k < m)
		{
				  String tempVar2 = ConsoleInput.scanfRead();
				  if (tempVar2 != null)
				  {
					  n = Integer.parseInt(tempVar2);
				  }
				  while (x < n)
				  {
							sum = sum + a / b;
							c = a;
							a = a + b;
							b = c;
							x = x + 1;
				  }
				  System.out.printf("%.3lf\n",sum);
				  sum = 0;
				  x = 0;
				  a = 2;
				  b = 1;
				  c = 0;
				  k = k + 1;
		}
	   return 0;
	}


}

