package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] str = new char[100][7];
		char[][] sts = new char[100][7];
		double[] u = new double[100];
		double[] fe = new double[100];
		double[] ma = new double[100];
		double n;
		double k;
		int f = 0;
		int m = 0;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			fe[i] = 0;
			ma[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sts[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				u[i] = Double.parseDouble(tempVar3);
			}
			if (sts[i][0] == 'f')
			{
				fe[i] = u[i];
				f++;
			}
			else if (sts[i][0] == 'm')
			{
				ma[i] = u[i];
				m++;
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - i - 1;j++)
			{
				if (ma[j + 1] > ma[j])
				{
					k = ma[j + 1];
					ma[j + 1] = ma[j];
					ma[j] = k;
				}
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - i - 1;j++)
			{
				if (fe[j + 1] > fe[j])
				{
					k = fe[j + 1];
					fe[j + 1] = fe[j];
					fe[j] = k;
				}
			}
		}
		for (i = m - 1;i >= 0;i--)
		{
			if (i == m - 1)
			{
				System.out.printf("%.2lf",ma[i]);
			}
			else if (i < m - 1)
			{
				System.out.printf(" %.2lf",ma[i]);
			}
		}
		for (i = 0;i < f;i++)
		{
			System.out.printf(" %.2lf",fe[i]);
		}
		return 0;
	}

}

