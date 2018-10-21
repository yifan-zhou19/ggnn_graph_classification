package <missing>;

public class GlobalMembers
{
	public static void deal(int n)
	{
		 double a;
		 double b;
		 a = 2.0;
		 b = 1.0;
		 double sum;
		 sum = 0.0;
		 int i;
		 for (i = 0; i < n; i++)
		 {
			   sum += a / b;
			   double t;
			   t = a;
			   a = a + b;
			   b = t;
		 }
		 System.out.printf("%.3lf\n", sum);
	}
	public static int Main()
	{
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0; i < m; i++)
		{
			  int n;
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  n = Integer.parseInt(tempVar2);
			  }
			  deal(n);
		}
		return 0;
	}


}

