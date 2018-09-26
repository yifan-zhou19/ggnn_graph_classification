package <missing>;

public class GlobalMembers
{
	public static double S(int m)
	{
		double[] a = new double[m];
		double aver = 0;
		double sum = 0;
		int i;
		for (i = 0;i < m;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Double.parseDouble(tempVar);
			}
			aver += a[i];
		}
		aver /= m;
		for (i = 0;i < m;i++)
		{
			sum += (a[i] - aver) * (a[i] - aver);
		}
		return (Math.sqrt(sum / m));
	}
	public static int Main()
	{
		int n;
		int m;
		for (scanf("%d", n);n > 0;n--)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				m = Integer.parseInt(tempVar);
			}
			System.out.printf("%.5f\n",S(m));
		}
		return 0;
	}

}

