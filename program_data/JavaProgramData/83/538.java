package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] f = new int[10];
		double GPA;
		double[] g = new double[10];
		int t;
		int i;
		int n;
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
				f[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				g[i] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (g[i] >= 90 && g[i] <= 100)
			{
				g[i] = 4;
			}
			else if (g[i] >= 85 && g[i] <= 89)
			{
				g[i] = 3.7;
			}
			else if (g[i] >= 82 && g[i] <= 84)
			{
				g[i] = 3.3;
			}
			else if (g[i] >= 78 && g[i] <= 81)
			{
				g[i] = 3.0;
			}
			else if (g[i] >= 75 && g[i] <= 77)
			{
				g[i] = 2.7;
			}
			else if (g[i] >= 72 && g[i] <= 74)
			{
				g[i] = 2.3;
			}
			else if (g[i] >= 68 && g[i] <= 71)
			{
				g[i] = 2.0;
			}
			else if (g[i] >= 64 && g[i] <= 67)
			{
				g[i] = 1.5;
			}
			else if (g[i] >= 60 && g[i] <= 63)
			{
				g[i] = 1.0;
			}
			else
			{
				g[i] = 0;
			}
		}
		for (GPA = 0,t = 0,i = 0;i < n;i++)
		{
			GPA = GPA + f[i] * g[i];
			t = t + f[i];
		}
		GPA = GPA / t;
		System.out.printf("%.2f\n",GPA);
	}

}

