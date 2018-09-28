package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0;i < k;i++)
		{
			double[] x = new double[1000];
			int n;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			int j;
			double sum = 0;
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[j] = Double.parseDouble(tempVar3);
				}
				sum += x[j];
			}
			double a = sum / n;
			double sum2 = 0;
			for (j = 0;j < n;j++)
			{
				sum2 += (x[j] - a) * (x[j] - a);
			}
			double S = Math.sqrt(sum2 / n);
			System.out.printf("%.5lf\n", S);
		}


	}


}

