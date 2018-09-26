package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int k;
		int n;
		double[] x = new double[100];
		double sum;
		double ping = 0;
		double s;
		double a;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			sum = 0;
			ping = 0;
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
			}
			for (j = 0;j < n;j++)
			{
				sum = sum + x[j];
			}
			a = (double)sum / n;
			for (j = 0;j < n;j++)
			{
				ping = ping + (x[j] - a) * (x[j] - a);
			}
			s = (double)Math.sqrt(ping / n);
			System.out.printf("%.5lf\n",s);
		}
	}
}

