package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		int j;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				m = Integer.parseInt(tempVar);
			}
		for (i = 0;i < m;i++)
		{
	double sum = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
					  double e = 1.0;
			for (j = 0;j < n;j++)
			{
				e = 1.0 + 1 / e;
				sum += e;
			}
	System.out.printf("%.3lf\n",sum);
		}
		return 0;
	}
}

