package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		double[] S = new double[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			int n;
			double[] x = new double[100];
			double sum_x = 0;
			double a;
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
					x[j] = Double.parseDouble(tempVar3);
				}
				sum_x += x[j];
			}
			a = sum_x / (double)n;
			double sum_X = 0;
			for (j = 0;j < n;j++)
			{
				sum_X += Math.pow((x[j] - a),2);
			}
			S[i] = Math.sqrt(sum_X / (double)n);
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%.5lf\n",S[i]);
		}
		return 0;
	}
}

