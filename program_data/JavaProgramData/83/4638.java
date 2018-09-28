package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		double GPA;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sf = new int[n];
		int[] df = new int[n];
		double x;
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sf[i] = Integer.parseInt(tempVar2);
			}
			x = x + sf[i];
		}
		double q = 0;
		double f = 0;
		for (int m = 0;m < n;m++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				df[m] = Integer.parseInt(tempVar3);
			}
			if (df[m] >= 90)
			{
				q = 4.0;
			}
	else if (df[m] >= 85)
	{
	q = 3.7;
	}
	else if (df[m] >= 82)
	{
	q = 3.3;
	}
	else if (df[m] >= 78)
	{
	q = 3.0;
	}
	else if (df[m] >= 75)
	{
	q = 2.7;
	}
	else if (df[m] >= 72)
	{
	q = 2.3;
	}
	else if (df[m] >= 68)
	{
	q = 2.0;
	}
	else if (df[m] >= 64)
	{
	q = 1.5;
	}
	else if (df[m] >= 60)
	{
	q = 1.0;
	}
	else
	{
	q = 0;
	}
	f = f + q * sf[m];

		}

		GPA = f / x;
		System.out.printf("%.2lf",GPA);
		return 0;
	}



}

