package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int t = 0;
	char[][] s = new char[41][7];
	double[] g = new double[41];
	double k;
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
			s[i] = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			g[i] = Double.parseDouble(tempVar3);
		}
		if (s[i][0] == 'm')
		{
	g[i] = g[i] - 2;
	t++;
		}
	}
	for (i = 1;i <= n;i++)
	{
		for (j = 0;j < n - 1;j++)
		{
			if (g[j] > g[j + 1])
			{
				k = g[j + 1];
				g[j + 1] = g[j];
				g[j] = k;
			}
		}
	}
		for (i = 0;i < t;i++)
		{
			System.out.printf("%.2lf ",g[i] + 2);
		}
		for (i = n - 1;i > t;i--)
		{
			System.out.printf("%.2lf ",g[i]);
		}
		System.out.printf("%.2lf",g[t]);



	return 0;
	}
}

