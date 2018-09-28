package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			int j;
			int m;
			double[] x = new double[1000];
			double s = 0.0;
			double s1 = 0.0;
			double a;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[j] = Double.parseDouble(tempVar3);
				}
			}
			for (j = 0;j < m;j++)
			{
				s += x[j];
			}
			a = (double)s / m;
			for (j = 0;j < m;j++)
			{
				s1 = s1 + (x[j] - a) * (x[j] - a);
			}
			System.out.printf("%.5lf\n",Math.sqrt(s1 / m));
		}
	}


}

