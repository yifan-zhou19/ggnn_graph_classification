package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int d;
		int c;
		int e = 0;
		int[] a = new int[9];
		double g;
		double[] b = new double[9];
		double f = 0;
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
				c = Integer.parseInt(tempVar2);
			}
		a[i] = c;
		}
		// printf("\n");
		for (j = 0;j < n;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				d = Integer.parseInt(tempVar3);
			}
			if (d >= 90)
			{
				b[j] = 4;
			}
			else if (d >= 85)
			{
		b[j] = 3.7;
			}
	else if (d >= 82)
	{
		b[j] = 3.3;
	}
	else if (d >= 78)
	{
		b[j] = 3.0;
	}
	else if (d >= 75)
	{
		b[j] = 2.7;
	}
	else if (d >= 72)
	{
		b[j] = 2.3;
	}
	else if (d >= 68)
	{
		b[j] = 2.0;
	}
	else if (d >= 64)
	{
		b[j] = 1.5;
	}
	else if (d >= 60)
	{
		b[j] = 1.0;
	}
	else
	{
		b[j] = 0;
	}
		}
		for (i = 0;i < n;i++)
		{
			e = e + a[i];
		}
		for (i = 0;i < n;i++)
		{
			f = f + a[i] * b[i];
		}
		g = f / e;
		System.out.printf("%.2f",g);
	}
}

