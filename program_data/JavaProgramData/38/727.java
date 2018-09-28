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
	int[] n = new int[1000];
	int i;
	int j;
	double[] shu = new double[100];
	double sum;
	double[] aver = new double[1000];
	double[] res = new double[1000];
	for (i = 0;i < k;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n[i] = Integer.parseInt(tempVar2);
		}
		sum = 0;
		for (j = 0;j < n[i];j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				shu[j] = Double.parseDouble(tempVar3);
			}
		}
		for (j = 0;j < n[i];j++)
		{
			sum += shu[j];
		}
		aver[i] = sum / n[i];
		res[i] = 0;
		for (j = 0;j < n[i];j++)
		{
			res[i] += (shu[j] - aver[i]) * (shu[j] - aver[i]);
		}
		res[i] = res[i] / n[i];
		res[i] = Math.sqrt(res[i]);
	}
	for (i = 0;i < k;i++)
	{
		System.out.printf("%.5lf\n",res[i]);
	}
	return 0;
	}

}

