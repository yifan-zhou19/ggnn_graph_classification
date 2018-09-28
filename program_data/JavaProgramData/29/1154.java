package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int j;
		int i;
		double x = 2;
		double y = 1;
		double a;
		double sum = 0;
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
		  for (j = 0;j < n;j++)
		  {
		  sum = sum + x / y;
		  a = x;
		  x = a + y;
		  y = a;
		  }
		  System.out.printf("%.3lf\n",sum);
		  sum = 0;
		  x = 2;
		  y = 1;
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		return 0;
	}

}

