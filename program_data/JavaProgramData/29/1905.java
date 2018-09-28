package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int m;
		double s;
		double[] f = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		while (m-- != 0)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}

		f[1] = 1;
		f[2] = 2;
		for (i = 3;i <= n + 1;i++)
		{
			f[i] = f[i - 2] + f[i - 1];
		}
		s = 0;
		for (i = 1;i <= n;i++)
		{
			s += f[i + 1] / f[i];
		}

		System.out.printf("%.3lf\n",s);
		}
		return 0;
	}
}

