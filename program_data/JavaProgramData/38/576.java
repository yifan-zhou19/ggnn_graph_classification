package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int a;
		double m;
		double[] x = new double[1000];
		double[] r = new double[100];

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
				a = Integer.parseInt(tempVar2);
			}
			m = 0;
			for (j = 0; j < a; j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[j] = Double.parseDouble(tempVar3);
				}
				if (j < a - 1)
				{
					scanf(" ");
				}
				m += x[j];
			}
			m /= a;
			r[i] = 0;
			for (j = 0; j < a; j++)
			{
				r[i] += Math.pow(x[j] - m,2);
			}
			r[i] = Math.sqrt(r[i] / a);
		}
		for (i = 0; i < n; i++)
		{
			System.out.printf("%.5lf\n", r[i]);
		}
		return 0;
	}
}

