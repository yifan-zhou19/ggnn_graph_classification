package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int i;
		int e;
		float b;
		float c;
		int[] s = new int[10];
		int[] g = new int[10];
		int[] k = new int[10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		e = 0;
		for (i = 0;i < a;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			(s[i]) = Integer.parseInt(tempVar2);
		}
		e += s[i];
		}
		b = 0F;
		for (i = 0;i < a;i++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			(g[i]) = Integer.parseInt(tempVar3);
		}
		if (g[i] < 60)
		{
			k[i] = 0 * s[i];
		}
		else if (g[i] >= 60 && g[i] <= 63)
		{
			k[i] = 10 * s[i];
		}
		else if (g[i] >= 64 && g[i] <= 67)
		{
			k[i] = 15 * s[i];
		}
		else if (g[i] >= 68 && g[i] <= 71)
		{
			k[i] = 20 * s[i];
		}
		else if (g[i] >= 72 && g[i] <= 74)
		{
			k[i] = 23 * s[i];
		}
		else if (g[i] >= 75 && g[i] <= 77)
		{
			k[i] = 27 * s[i];
		}
		else if (g[i] >= 78 && g[i] <= 81)
		{
			k[i] = 30 * s[i];
		}
		else if (g[i] >= 82 && g[i] <= 84)
		{
			k[i] = 33 * s[i];
		}
		else if (g[i] >= 85 && g[i] <= 89)
		{
			k[i] = 37 * s[i];
		}
		else if (g[i] >= 90 && g[i] <= 100)
		{
			k[i] = 40 * s[i];
		}
		b += k[i];
		}
		c = 1.0 * b / e / 10;
		System.out.printf("%.2f",c);
		return 0;
	}
}

