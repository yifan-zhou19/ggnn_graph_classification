package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		double[] x = new double[100];
		double[] n = new double[100];
		double[] sum1 = new double[100];
		double[] sum2 = new double[100];
		double[] s = new double[100];
		int i;
		int j;
		for (i = 0;i < k;i++)
		{
		sum1[i] = 0;
		sum2[i] = 0;
		s[i] = 0;
		}
		for (i = 0;i < k;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			(n[i]) = Double.parseDouble(tempVar2);
		}
		for (j = 0;j < n[i];j++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			(x[j]) = Double.parseDouble(tempVar3);
		}
		sum1[i] += x[j];
		}
	for (j = 0;j < n[i];j++)
	{
		sum2[i] += Math.pow(x[j] - sum1[i] / n[i],2);
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

