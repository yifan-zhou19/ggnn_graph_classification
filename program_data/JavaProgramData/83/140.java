package <missing>;

public class GlobalMembers
{
	public static float mgpa(int y)
	{
		int gpa;
		if (y >= 90 && y <= 100)
		{
			return 4.0F;
		}
		else if (y >= 85 && y <= 89)
		{
			return 3.7F;
		}
		else if (y >= 82 && y <= 84)
		{
			return 3.3F;
		}
		else if (y >= 78 && y <= 81)
		{
			return 3.0F;
		}
		else if (y >= 75 && y <= 77)
		{
			return 2.7F;
		}
		else if (y >= 72 && y <= 74)
		{
			return 2.3F;
		}
		else if (y >= 68 && y <= 71)
		{
			return 2.0F;
		}
		else if (y >= 64 && y <= 67)
		{
			return 1.5F;
		}
		else if (y >= 60 && y <= 63)
		{
			return 1.0F;
		}
		else
		{
			return 0.0F;
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int[] score = new int[50];
		int[] weight = new int[50];
		float[] g = new float[50];
		float a = 0.0F;
		float b = 0.0F;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1; i <= n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				weight[i] = Integer.parseInt(tempVar2);
			}
			b += weight[i];
		}
		for (i = 1; i <= n; i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				score[i] = Integer.parseInt(tempVar3);
			}
			g[i] = mgpa(score[i]) * weight[i];
			a += g[i];
		}
		System.out.printf("%.2f", a / b);
		return 0;
	}
}

