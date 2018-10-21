package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int[] u = new int[100];
	int a;
	int b = 0;
	int[] g = new int[100];
	float sum = 0F;
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
			u[i] = Integer.parseInt(tempVar2);
		}
		b = b + u[i];
	}
	for (i = 0;i < n;i++)
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			g[i] = Integer.parseInt(tempVar3);
		}
		if (g[i] <= 100 && g[i] >= 90)
		{
			sum = u[i] * 4.0 + sum;
		}
		else if (g[i] <= 84 && g[i] >= 82)
		{
			sum = u[i] * 3.3 + sum;
		}
		else if (g[i] <= 89 && g[i] >= 85)
		{
			sum = u[i] * 3.7 + sum;
		}
	else if (g[i] <= 81 && g[i] >= 78)
	{
			sum = u[i] * 3.0 + sum;
	}
	else if (g[i] <= 77 && g[i] >= 75)
	{
			sum = u[i] * 2.7 + sum;
	}
	else if (g[i] <= 74 && g[i] >= 72)
	{
			sum = u[i] * 2.3 + sum;
	}
	else if (g[i] <= 71 && g[i] >= 68)
	{
			sum = u[i] * 2.0 + sum;
	}
	else if (g[i] <= 67 && g[i] >= 64)
	{
			sum = u[i] * 1.5 + sum;
	}
	else if (g[i] <= 63 && g[i] >= 60)
	{
			sum = u[i] * 1.0 + sum;
	}
	else if (g[i] <= 59 && g[i] >= 0)
	{
			sum = u[i] * 0.0 + sum;
	}
	}

	System.out.printf("%.2f", sum / b);
				return 0;
	}

}

