package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int i;
		int j;
		double[] x = new double[1000];
		double a;
		double[] s = new double[1000];
		double[] S = new double[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			s[i] = 0;
			a = 0;
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
				a += x[j] / n;
			}
			for (j = 0;j < n;j++)
			{

				s[i] += (x[j] - a) * (x[j] - a) / n;
			}
			S[i] = Math.sqrt(s[i]);
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%.5lf\n",S[i]);
		}
		return 0;
	}
}

