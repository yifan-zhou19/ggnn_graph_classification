package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		double[] s = new double[100];
		double f1;
		double f2;
		double c;
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
			f1 = 1;
			f2 = 2;
			if (n == 1)
			{
				s[i] = 2;
			}
			else
			{
				for (j = 0;j < n;j++)
				{
					s[i] += (double)(f2 / f1);
					c = f1;
					f1 = f2;
					f2 = c + f1;
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%.3lf\n",s[i]);
		}
		return 0;
	}
}

