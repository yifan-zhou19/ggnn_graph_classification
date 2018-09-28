package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int k;
		int n;
		int i;
		int j;
		double[] x = new double[5000];
		double sum;
		double aver;
		double a;
		double b;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}

		for (i = 0; i < k; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}

			sum = 0;
			for (j = 0; j < n; j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[j] = Double.parseDouble(tempVar3);
				}
				sum += x[j];
			}
			aver = sum / n;

			a = 0;
			for (j = 0; j < n; j++)
			{
				a += Math.pow((x[j] - aver), 2);
			}
			b = Math.sqrt(a / n);

			System.out.printf("%.5lf\n", b);

		}

	}



}

