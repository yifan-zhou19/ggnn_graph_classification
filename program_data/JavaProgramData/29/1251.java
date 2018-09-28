package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int[] n = new int[100];
		int i;
		int j;
		double[] h = new double[100];
		double[] s = new double[100];
		double[] z = new double[100];
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
				(n[i]) = Integer.parseInt(tempVar2);
			}
			h[i] = 0;
		}
		s[0] = 1;
		s[1] = 2;
		for (i = 2;i < 100;i++)
		{
			s[i] = s[i - 1] + s[i - 2];
		}
		for (i = 0;i < 100;i++)
		{
			z[i] = s[i + 1] / s[i];
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n[i];j++)
			{
				h[i] += z[j];
			}
		}
		for (i = 0;i < m;i++)
		{
				System.out.printf("%.3lf\n",h[i]);
		}
		return 0;
	}
}

