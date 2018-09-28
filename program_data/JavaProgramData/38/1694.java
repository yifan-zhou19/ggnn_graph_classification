package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] x = new double[101];
		double ave;
		double s = 0;
		double S = 0;
		int i;
		int j;
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= k;i++)
		{
			s = 0;
			S = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (j = 1;j <= n;j++)
			{
				if (j == 1)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						x[j] = Double.parseDouble(tempVar3);
					}
				}
				else
				{
					String tempVar4 = ConsoleInput.scanfRead(" ");
					if (tempVar4 != null)
					{
						x[j] = Double.parseDouble(tempVar4);
					}
				}
				s = s + x[j];
			}
			ave = s / n;
			for (j = 1;j <= n;j++)
			{
				S = S + (x[j] - ave) * (x[j] - ave);
			}
			S = Math.sqrt(S / n);
			System.out.printf("%.5lf\n",S);
		}
	}
}

