package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int n;
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		double[] x = new double[100];
		while (j < k)
		{
			double a = 0;
			double s = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(x[i]) = Double.parseDouble(tempVar3);
				}
			}
			for (i = 0;i < n;i++)
			{
				a += x[i];
			}
			a = a / (n * 1.0);
			for (i = 0;i < n;i++)
			{
				s += (x[i] - a) * (x[i] - a);
			}
			s = s / (n * 1.0);
			s = Math.sqrt(s);
			System.out.printf("%.5lf\n",s);
			j++;

		}
		return 0;
	}
}

