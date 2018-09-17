package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m = 0;
		int f = 0;
		int j;

		String s = new String(new char[10]);
		double x;
		double[] ma = new double[50];
		double[] fe = new double[50];
		double t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead("\n");
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				x = Double.parseDouble(tempVar3);
			}
			if (s.charAt(0) == 'm')
			{
				ma[m] = x;
				m++;
			}
			if (s.charAt(0) == 'f')
			{
				fe[f] = x;
				f++;
			}
		}

		for (i = 0;i < m;i++)
		{
			for (j = 0;j < m - i - 1;j++)
			{
					if (ma[j] > ma[j + 1])
					{
						t = ma[j];
						ma[j] = ma[j + 1];
						ma[j + 1] = t;
					}
			}
		}

		for (i = 0;i < f;i++)
		{
			for (j = 0;j < f - i - 1;j++)
			{
					if (fe[j] < fe[j + 1])
					{
						t = fe[j];
						fe[j] = fe[j + 1];
						fe[j + 1] = t;
					}
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%.2lf ",ma[i]);
		}
		for (i = 0;i < f;i++)
		{
			if (i == f - 1)
			{
			System.out.printf("%.2lf",fe[i]);
			}
			else
			{
			System.out.printf("%.2lf ",fe[i]);
			}
		}

		return 0;
	}
}

