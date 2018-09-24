package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int i;
		int j;
		double[][] x = new double[4000][101];
		double[] s = new double[4000];
		double[] a = new double[4000];
		double[] t = new double[4000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			a[i] = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[i][j] = Double.parseDouble(tempVar3);
				}
				a[i] += x[i][j];
			}
			a[i] = a[i] / n;
			t[i] = 0;
			for (j = 0;j < n;j++)
			{
				t[i] += (x[i][j] - a[i]) * (x[i][j] - a[i]);
			}
			s[i] = Math.sqrt(t[i] / n);
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%.5lf\n",s[i]);
		}
		return 0;
	}

}

