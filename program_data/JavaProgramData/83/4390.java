package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
		  double[] fen = new double[10];
		  double[] g = new double[10];
		  double sp;
		  double sum;
		  double gpa;
	for (i = 1;i <= n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		fen[i] = Double.parseDouble(tempVar2);
	}
	}
	for (i = 1;i <= n;i++)
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			g[i] = Double.parseDouble(tempVar3);
		}
	}
	for (i = 1;i <= n;i++)
	{
		if (g[i] >= 90)
		{
			g[i] = 4.0;
		}
		else if (g[i] >= 85)
		{
			g[i] = 3.7;
		}
		else if (g[i] >= 82)
		{
			g[i] = 3.3;
		}
		else if (g[i] >= 78)
		{
			g[i] = 3.0;
		}
		else if (g[i] >= 75)
		{
			g[i] = 2.7;
		}
		else if (g[i] >= 72)
		{
			g[i] = 2.3;
		}
		else if (g[i] >= 68)
		{
			g[i] = 2.0;
		}
		else if (g[i] >= 64)
		{
			g[i] = 1.5;
		}
		else if (g[i] >= 60)
		{
			g[i] = 1.0;
		}
		else
		{
			g[i] = 0.0;
		}
	}
	for (i = 1;i <= n;i++)
	{
			sp += fen[i] * g[i];
			sum += fen[i];
	}
		gpa = sp / sum;
		System.out.printf("%.2lf",gpa);
		return 0;
	}
}

