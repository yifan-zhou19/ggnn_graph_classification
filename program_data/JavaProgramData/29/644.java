package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int e;
		int i = 0;
		int j = 0;
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
		   int k = 2;
		   int l = 1;
		   for (j = 0;j < n;j++)
		   {
			  sum = sum + (double)k / l;
			  e = k;
			  k = k + l;
			  l = e;
		   }
		   System.out.printf("%.3lf\n",sum);
		   sum = 0;
		}
		return 0;
	}


}

