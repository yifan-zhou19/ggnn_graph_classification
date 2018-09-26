package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j;
		int n;
		double[] A = new double[100];
		double sum1;
		double sum2;
		double[] S = new double[100];
		double a;
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
				n = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					A[j] = Double.parseDouble(tempVar3);
				}
			}
			for (j = 0,sum1 = 0;j < n;j++)
			{
				sum1 += A[j];
			}
			a = sum1 / n;
			for (j = 0,sum2 = 0;j < n;j++)
			{
				sum2 += (A[j] - a) * (A[j] - a);
			}
			S[i] = Math.sqrt(sum2 / n);
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%.5f\n",S[i]);
		}
		return 0;
	}

}

