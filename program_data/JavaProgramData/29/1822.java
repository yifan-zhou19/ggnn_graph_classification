package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		double a;
		double b;
		double[] e = new double[3000];
		double sum;
		double num;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			e[1] = 1;
			e[2] = 2;
			num = e[2] / e[1];
			for (j = 3;j <= n + 1;j++)
			{
				e[j] = e[j - 1] + e[j - 2];
				num += e[j] / e[j - 1];
			}
			System.out.printf("%.3lf\n",num);
		}
		return 0;
	}



}

