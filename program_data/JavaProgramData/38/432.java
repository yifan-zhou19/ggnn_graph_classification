package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] j = new int[50];
		int b;
		double[] k = new double[100];
		double sum;
		double a;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				j[i] = Integer.parseInt(tempVar2);
			}
			for (b = 0; b < j[i]; b++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					k[b] = Double.parseDouble(tempVar3);
				}
			}

			sum = 0;

			for (b = 0; b < j[i]; b++)
			{
				sum += k[b];
			}

			a = sum / (j[i]);
			sum = 0;

			for (b = 0; b < j[i]; b++)
			{
				sum += (k[b] - a) * (k[b] - a);
			}

			sum = Math.sqrt(sum / j[i]);
			System.out.printf("%.5lf\n", sum);
		}
		return 0;
	}
}

