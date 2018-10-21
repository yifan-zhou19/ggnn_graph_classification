package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int judge;
		int p;
		int q;
		int m;
		double mid;
		double[] b = new double[110];
		double f;
		double y;
		double total;
		double a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			total = 0;
			for (j = 1;j <= m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b[j] = Double.parseDouble(tempVar3);
				}
				total = total + b[j];
			}
			a = total / m;
			mid = 0;
			for (j = 1;j <= m;j++)
			{
				mid = mid + (b[j] - a) * (b[j] - a) / m;
			}
			f = Math.sqrt(mid);
			System.out.printf("%.5lf\n",f);
		}
		return 0;
	}


}

