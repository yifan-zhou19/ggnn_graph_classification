package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int[] n = new int[100];
		int j;
		double[] s = new double[100];
		double sum;
		double a;
		double sum2;
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
			double[] x = new double[100];
			sum = 0;
			for (j = 0;j < n[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[j] = Double.parseDouble(tempVar3);
				}
				sum += x[j];
			}
			a = sum / n[i];
			sum2 = 0;
			for (j = 0;j < n[i];j++)
			{
				sum2 += Math.pow(x[j] - a,2);
			}
			s[i] = Math.sqrt(sum2 / n[i]);
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%.5lf\n",s[i]);
		}
		return 0;
	}
}

