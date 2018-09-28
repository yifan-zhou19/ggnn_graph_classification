package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		double sum;
		double[] x = new double[100];
		double a;
		double b;
		double c;
		double S;
		int i;
		int j;
		double sum1;
		String tempVar = ConsoleInput.scanfRead("\n");
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			sum = 0;
			sum1 = 0;
			String tempVar2 = ConsoleInput.scanfRead("\n");
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
				sum += x[j];
			}
			a = sum / n;
			for (j = 0;j < n;j++)
			{
				b = (x[j] - a) * (x[j] - a);
				sum1 += b;
			}
			c = sum1 / n;
			S = Math.sqrt(c);
			System.out.printf("%.5lf\n",S);
		}
		return 0;
	}
}

