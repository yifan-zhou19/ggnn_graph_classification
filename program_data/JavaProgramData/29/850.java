package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int i = 0;
		int k = 1;
		int M = 1;
		int m = 2;
			double sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (k = 1;k < a[i] + 1;k++)
			{
				if (k == 1)
				{
				sum += (double)m / M;
				}
				else
				{
					int o = m;
					m = M + m;
					M = o;
				sum += (double)m / M;
				}
			}
					System.out.printf("%.3lf\n",sum);
					m = 2;
					M = 1;
					sum = 0;
		}
	   return 0;
	}

}

