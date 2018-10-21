package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int k;
		int n;
		int i;
		int j;
	double[] a = new double[1000];
	double av = 0;
	double s = 0;
	double out = 0;
	double[] p = a;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	for (j = 0;j < k;j++)
	{
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
				p + i = tempVar3;
			}
		av += p[i];
		}
		av = av / n;
		for (i = 0;i < n;i++)
		{
		s += (a[i] - av) * (a[i] - av);
		}
		s = s / n;
		out = Math.sqrt(s);
		System.out.printf("%.5lf\n",out);
		s = 0;
		out = 0;
		av = 0;
	}
	}
}

