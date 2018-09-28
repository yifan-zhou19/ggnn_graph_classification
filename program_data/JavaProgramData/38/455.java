package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int k;
		int i;
		int j;
		double S;
		double s;
		double[] x = new double[num];
		double a;
		double[] y = new double[num];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				k = Integer.parseInt(tempVar2);
			}
			s = 0;
			S = 0;
			for (j = 0;j < k;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[j] = Double.parseDouble(tempVar3);
				}
				s += x[j];
			}
			a = s / k;
			for (j = 0;j < k;j++)
			{
				S += Math.pow((x[j] - a), 2);
			}
			y[i] = Math.sqrt(S / k);

		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%.5lf\n",y[i]);
		}
	}

}

