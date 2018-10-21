package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int[] sub = new int[10];
	int[] g = new int[10];
	int s = 0;
	float[] G = new float[10];
	float GPA = 0F;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n - 1;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		sub[i] = Integer.parseInt(tempVar2);
	}
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		sub[n - 1] = Integer.parseInt(tempVar3);
	}
	for (i = 0;i < n - 1;i++)
	{
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		g[i] = Integer.parseInt(tempVar4);
	}
	}
	String tempVar5 = ConsoleInput.scanfRead();
	if (tempVar5 != null)
	{
		g[n - 1] = Integer.parseInt(tempVar5);
	}
	for (i = 0;i < n;i++)
	{
	if (90 <= g[i] != 0 && g[i] <= 100)
	{
	G[i] = 4.0F;
	}
	else if (85 <= g[i] != 0 && g[i] <= 89)
	{
	G[i] = 3.7F;
	}
	else if (82 <= g[i] != 0 && g[i] <= 84)
	{
	G[i] = 3.3F;
	}
	else if (78 <= g[i] != 0 && g[i] <= 81)
	{
	G[i] = 3.0F;
	}
	else if (75 <= g[i] != 0 && g[i] <= 77)
	{
	G[i] = 2.7F;
	}
	else if (72 <= g[i] != 0 && g[i] <= 74)
	{
	G[i] = 2.3F;
	}
	else if (68 <= g[i] != 0 && g[i] <= 71)
	{
	G[i] = 2.0F;
	}
	else if (64 <= g[i] != 0 && g[i] <= 67)
	{
	G[i] = 1.5F;
	}
	else if (60 <= g[i] != 0 && g[i] <= 63)
	{
	G[i] = 1.0F;
	}
	else if (g[i] <= 59)
	{
	G[i] = 0F;
	}
	G[i] *= sub[i];
	GPA += G[i];
	s += sub[i];
	}
	GPA = GPA / s;
	System.out.printf("%.2f",GPA);
	return 0;
	}

}

