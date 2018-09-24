package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j;
		int[] n = new int[1000];
		double[][] x = new double[1000][1000];
		double[] s = new double[1000];
		double[] a = new double[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[i] = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < n[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[i][j] = Double.parseDouble(tempVar3);
				}
				a[i] = a[i] + x[i][j];
			}
		}
		for (i = 0;i < k;i++)
		{
			a[i] = a[i] / n[i];
			for (j = 0;j < n[i];j++)
			{
				s[i] = s[i] + (x[i][j] - a[i]) * (x[i][j] - a[i]);
			}
			s[i] = Math.sqrt(s[i] / n[i]);
			System.out.printf("%.5lf\n",s[i]);
		}
	return 0;
	}
}

