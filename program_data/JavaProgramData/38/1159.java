package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= k;i++)
		{
			int n;
			int m;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			double[] jfc = new double[100];
			double sum = 0.0;
			for (m = 0;m <= n - 1;m++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(jfc[m]) = Double.parseDouble(tempVar3);
				}
				sum = sum + jfc[m];
			}
			double pj;
			double bzc = 0.0;
			double fc;
			pj = sum / (double)n;
			for (m = 0;m <= n - 1;m++)
			{
				bzc = bzc + Math.pow(jfc[m] - pj,2);
			}
			fc = Math.sqrt(bzc / (double)n);
			System.out.printf("%.5f\n",fc);
		}
		return 0;
	}
}

