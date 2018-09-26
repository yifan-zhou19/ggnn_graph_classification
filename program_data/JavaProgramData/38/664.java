package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] f = new double[100];
		double sum = 0.0;
		double a = 0.0;
		double s = 0.0;
		double S;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < k;i++)
		{
			int n;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (int j = 0;j < n;j++)
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(f[j]) = Double.parseDouble(tempVar3);
			}
			sum += f[j];
			}
			a = sum * 1.0 / n;
			for (int j = 0;j < n;j++)
			{
			s += Math.pow(f[j] - a,2);
			}
			S = Math.pow(s * 1.0 / n,1.0 / 2);
			System.out.printf("%.5lf\n",S);
			sum = 0.0;
			s = 0.0;

		}
	return 0;
	}
}

