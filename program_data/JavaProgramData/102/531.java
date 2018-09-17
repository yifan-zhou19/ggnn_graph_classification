package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] s = new char[1000][8];
	double[] h = new double[1000];
	double[] zh = new double[1000];
	int n;
	int i;
	int j = 0;
	int m;
	int r;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	m = n - 1;
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s[i] = tempVar2.charAt(0);
		}
		if (s[i][0] == 'm')
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				h[i] = Double.parseDouble(tempVar3);
			}
			zh[j] = h[i];
			j++;
		}
		else
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				h[i] = Double.parseDouble(tempVar4);
			}
			zh[m] = h[i];
			m--;
		}
	}
	for (i = 1;i < j;i++)
	{
		double tmp = zh[i];
		for (r = i - 1;r >= 0;r--)
		{
			if (tmp < zh[r])
			{
				 zh[r + 1] = zh[r];
				 zh[r] = tmp;
			}
			else
			{
				zh[r + 1] = tmp;
				break;
			}
		}
	}
	for (i = 0;i < n - j;i++)
	{
	for (r = j;r < n - i;r++)
	{
		if (zh[r] < zh[r + 1])
		{
			double tm = zh[r + 1];
			zh[r + 1] = zh[r];
			zh[r] = tm;
		}
	}
	}

	for (i = 0;i < n - 1;i++)
	{
	System.out.printf("%.2lf ",zh[i]);
	}
	System.out.printf("%.2lf",zh[n - 1]);

	return 0;
	}

}

