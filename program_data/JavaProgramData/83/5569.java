package <missing>;

public class GlobalMembers
{
	public static float GPAlize(int n)
	{
		if (n >= 90)
		{
			return 4.0F;
		}
		else if (n >= 85 && n <= 89)
		{
			return 3.7F;
		}
		else if (n >= 82 && n <= 84)
		{
			return 3.3F;
		}
		else if (n >= 78 && n <= 81)
		{
			return 3.0F;
		}
		else if (n >= 75 && n <= 77)
		{
			return 2.7F;
		}
		else if (n >= 72 && n <= 74)
		{
			return 2.3F;
		}
		else if (n >= 68 && n <= 71)
		{
			return 2.0F;
		}
		else if (n >= 64 && n <= 67)
		{
			return 1.5F;
		}
		else if (n >= 60 && n <= 63)
		{
			return 1.0F;
		}
		else
		{
			return 0F;
		}
	}
	public static int Main()
	{
		int n;
		int[] m = new int[10];
		int[] g = new int[10];
		int i;
		float sum2 = 0F;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			sum2 += m[i];
		}
		for (i = 0; i < n; i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				g[i] = Integer.parseInt(tempVar3);
			}
		}
		float[] c = new float[10];
		float sum1 = 0F;
		for (i = 0; i < n; i++)
		{
			c[i] = GPAlize(g[i]) * m[i];
			sum1 += c[i];
		}
		System.out.printf("%.2f\n", sum1 / sum2);
	}
}

