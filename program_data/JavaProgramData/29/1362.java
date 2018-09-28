package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int[] z = new int[1000];
		double[] p = new double[1000];
		double[] n = new double[1000];
		double[] s = new double[1000];
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				z[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < m;i++)
		{
			p[1] = 1;
			n[1] = 2;
			s[i] = 0;
		if (z[i] == 1)
		{
			s[i] = 2.000;
			System.out.printf("%.3lf\n",s[i]);
		}
		else if (z[i] >= 2)
		{
			for (j = 2;j <= z[i];j++)
			{
				p[j] = n[j - 1];
				n[j] = p[j - 1] + n[j - 1];
				s[i] += n[j] / p[j];
				if (j == z[i])
				{
					System.out.printf("%.3lf\n",s[i] + 2);
				}
			}
		}
		}
		return 0;
	}
}

