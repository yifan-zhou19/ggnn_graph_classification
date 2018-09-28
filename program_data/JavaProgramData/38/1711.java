package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		double[] shuJu = new double[N];

		double a;
		double[] s = new double[K];

		int k;
		int n;
		int i;
		int j;

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

			for (j = 0; j < n; j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(shuJu[j]) = Double.parseDouble(tempVar3);
				}
			}

			a = 0;

			for (j = 0; j < n; j++)
			{
				a += shuJu[j];
			}

			a = a / n;

			s[i] = 0;
			for (j = 0; j < n; j++)
			{
				s[i] += (shuJu[j] - a) * (shuJu[j] - a);
			}

			s[i] /= n;

			s[i] = Math.sqrt(s[i]);

		}

		for (i = 0; i < k; i++)
		{
			System.out.printf("%.5lf\n", s[i]);
		}



		return 0;
	}
}

