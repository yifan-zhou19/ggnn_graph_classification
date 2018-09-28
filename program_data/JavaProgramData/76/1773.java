package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int min;
		int max;
		int n;
		int[] sz = new int[50010];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct cui
	//	{
	// int x;
	// int y;
	//}
	//cui[qujian];
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			(cui[i].x) = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			(cui[i].y) = tempVar3;
		}
	}
	min = cui[0].x;
	max = cui[0].y;
	for (i = 0;i < n;i++)
	{
		if (cui[i].x < min)
		{
			min = cui[i].x;
		}
	}
	for (i = 0;i < n;i++)
	{
		if (cui[i].y > max)
		{
			max = cui[i].y;
		}
	}
	for (i = min;i <= max;i++)
	{
		sz[i] = 1;
	}
	for (i = 0;i < n;i++)
	{
		for (j = (cui[i].x);j < (cui[i].y);j++)
		{
			sz[j] = 0;
		}
	}
	for (i = min;i < max;i++)
	{
		if (sz[i] == 1)
		{
	System.out.print("no");
	return 0;
		}
	}
	System.out.printf("%d %d",min,max);
	return 0;
	}
}

