package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int[] t = new int[100];
		double[][] x = new double[100][100];
		double s;
		double S;
		double a;
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
				m = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[i][j] = Double.parseDouble(tempVar3);
				}
				t[i] = m;
			}
		}

		for (i = 0;i < n;i++)
		{
			a = s = 0;
			for (j = 0;j < t[i];j++)
			{
				a += x[i][j] / t[i];


			}

			for (j = 0;j < t[i];j++)
			{
				s += (x[i][j] - a) * (x[i][j] - a) / t[i];

			}

			S = Math.sqrt(s);
			System.out.printf("%.5lf\n",S);
		}
		return 0;
	}


}

