package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j;
		int[] shu = new int[100];
		double[][] ju = new double[100][100];
		double[] sum = new double[100];
		double[] z = new double[100];
		double[] a = new double[100];
		double[] s = new double[100];
		for (i = 0;i < 100;i++)
		{
			sum[i] = 0;
		}
		for (i = 0;i < 100;i++)
		{
			s[i] = 0;
		}
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
				shu[i] = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < shu[i];j++)
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				ju[i][j] = Double.parseDouble(tempVar3);
			}
			sum[i] += ju[i][j];
			}
			a[i] = sum[i] / shu[i];
		}
		for (i = 0;i < k;i++)
		{
			for (j = 0;j < shu[i];j++)
			{
			s[i] += (ju[i][j] - a[i]) * (ju[i][j] - a[i]);
			}
			z[i] = Math.pow(s[i] / shu[i],0.5);
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("\n%.5lf",z[i]);
		}
		return 0;
	}
}

