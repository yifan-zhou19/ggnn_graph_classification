package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j;
		int[] n = new int[100];
		double[][] t = new double[100][1000];
		double[] s = new double[100];
		double[] a = new double[100];
		double[] sum = new double[100];
		double[] sum2 = new double[100];
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
					t[i][j] = Double.parseDouble(tempVar3);
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			sum2[i] = 0;
			sum[i] = 0;
			a[i] = 0;
			for (j = 0;j < n[i];j++)
			{
				sum[i] += t[i][j];
			}
			for (j = 0;j < n[i];j++)
			{
				a[i] = sum[i] / n[i];
			}
			for (j = 0;j < n[i];j++)
			{
				sum2[i] += (t[i][j] - a[i]) * (t[i][j] - a[i]);
			}
			for (j = 0;j < n[i];j++)
			{
				s[i] = Math.sqrt(sum2[i] / n[i]);
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%.5lf\n",s[i]);
		}
		return 0;
	}
}

