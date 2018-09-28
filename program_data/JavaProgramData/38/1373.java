package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j;
		int n;
		double[] a = new double[1001];
		double s;
		double p;
		double av;
		double sum;
		double t;
		double to;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (j = 0;j < k;j++)
		{
			sum = 0;
			t = 0;
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
					a[i] = Double.parseDouble(tempVar3);
				}
			}
			for (i = 0;i < n;i++)
			{
				sum += a[i];
			}
			av = sum / n;
			for (i = 0;i < n;i++)
			{
				t += (a[i] - av) * (a[i] - av);
			}
			to = t / n;
			s = Math.sqrt(to);
			System.out.printf("%.5lf\n", s);
		}
		return 0;
	}
}

