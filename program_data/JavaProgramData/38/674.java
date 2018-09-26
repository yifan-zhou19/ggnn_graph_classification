package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int i;
		int j;
		double s = 0;
		double[] x = new double[100];
		double a;
		double[] S = new double[100];
		double d = 0;
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
					x[j] = Double.parseDouble(tempVar3);
				}
				s += x[j];
			}
			a = s / (double)n;
			for (j = 0;j < n;j++)
			{
				d += (x[j] - a) * (x[j] - a);
			}
			S[i] = Math.sqrt(d / (double)n);
			s = 0;
			d = 0;
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%.5f\n", S[i]);
		}
		return 0;
	}
}

