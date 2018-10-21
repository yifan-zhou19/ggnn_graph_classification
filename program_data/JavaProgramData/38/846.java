package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j;
		int[] n = new int[N];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		double[] a = new double[N];
		double[] S = new double[N];
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[i] = Integer.parseInt(tempVar2);
			}
			S[i] = 0.0;
			double sum = 0.0;
			double[] x = new double[M];
			for (j = 0;j < n[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[j] = Double.parseDouble(tempVar3);
				}
				sum += x[j];
			}
			a[i] = sum / n[i];
			for (j = 0;j < n[i];j++)
			{
				S[i] += (x[j] - a[i]) * (x[j] - a[i]);
			}
			S[i] = Math.sqrt(S[i] / n[i]);
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%.5f\n",S[i]);
		}
		return 0;
	}
}

