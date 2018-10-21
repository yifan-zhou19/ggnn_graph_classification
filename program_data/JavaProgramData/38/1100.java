package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		double[] x = new double[1000];
		double S;
		double a;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *p[1000];
		double[] p = new double[1000];
		double sum;
		int i;
		int k;
		int n;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}

		for (i = 0;i < 1000;i++)
		{
			p[i] = x + i;
		}

		while (k-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			sum = 0;

			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p[i] = tempVar3;
				}
				sum += p[i];
			}
			a = sum / n;

			S = 0;
			for (i = 0;i < n;i++)
			{
			S += (p[i] - a) * (p[i] - a);
			}

			S = Math.sqrt(S / n);

			System.out.printf("%.5f\n", S);
		}
	}
}

