package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int f;
		int z = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] g = new int[11];
		double[] p = new double[11];
		double GPA;
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				g[i - 1] = Integer.parseInt(tempVar2);
			}
			z += g[i - 1];
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				f = Integer.parseInt(tempVar3);
			}
			if (f < 60)
			{
				p[i - 1] = 0;
			}
			else if (f >= 60 && f <= 63)
			{
				p[i - 1] = 1.0;
			}
			else if (f >= 64 && f <= 67)
			{
				p[i - 1] = 1.5;
			}
			else if (f >= 68 && f <= 71)
			{
				p[i - 1] = 2.0;
			}
			else if (f >= 72 && f <= 74)
			{
				p[i - 1] = 2.3;
			}
			else if (f >= 75 && f <= 77)
			{
				p[i - 1] = 2.7;
			}
			else if (f >= 78 && f <= 81)
			{
				p[i - 1] = 3.0;
			}
			else if (f >= 82 && f <= 84)
			{
				p[i - 1] = 3.3;
			}
			else if (f >= 85 && f <= 89)
			{
				p[i - 1] = 3.7;
			}
			else if (f >= 90 && f <= 100)
			{
				p[i - 1] = 4.0;
			}
		}
		for (i = 1;i <= n;i++)
		{
			GPA += p[i - 1] * g[i - 1];
		}
		GPA = GPA / z;
		System.out.printf("%.2f",GPA);
	}
}

