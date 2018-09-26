package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		double[] x = new double[100];
		double s;
		double m = 0.0;
		double s1;
		double k;
		double S;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			m = 0;
			s1 = 0;
			s = 0;
			S = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				k = Double.parseDouble(tempVar2);
			}
			for (j = 0;j < k;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[j] = Double.parseDouble(tempVar3);
				}
				m += x[j] / k;
			}
			for (j = 0;j < k;j++)
			{
				s += Math.pow(x[j] - m,2);
				s1 = s / k;
			}
			S = Math.sqrt(s1);
			System.out.printf("%.5lf\n",S);
		}
		return 0;
	}

}

