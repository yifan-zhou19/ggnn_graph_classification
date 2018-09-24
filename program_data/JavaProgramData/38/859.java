package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		double sum;
		double a;
		double b;
		double S;
		double[] x = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (j = 0;j < k;j++)
		{
			sum = 0.0;
			a = 0.0;
			b = 0.0;
			S = 0.0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[i] = Double.parseDouble(tempVar3);
				}
				sum += x[i];
			}
			a = sum / n;
			for (i = 0;i < n;i++)
			{
				b += (x[i] - a) * (x[i] - a);
			}
			S = Math.sqrt(b / n);
			System.out.printf("%.5f\n",S);

		}


		return 0;

	}

}

