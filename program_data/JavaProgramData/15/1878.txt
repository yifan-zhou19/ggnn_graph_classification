package <missing>;

public class GlobalMembers
{
	public static int[][] sz = new int[1000][1000];
	public static int Main()
	{
	int n;
	int i;
	int j;
	int a;
	int b;
	int c;
	int d;
	int e = 0;
	int h = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(sz[i][j]) = Integer.parseInt(tempVar2);
			}
		}
	}
	for (i = 0;i < n;i++)
	{
		for (j = 0;j < n;j++)
		{
			if (sz[i][j] == 0)
			{
			a = i;
			b = j;
			h = 1;
			}
			if (h == 1)
			{
				break;
			}
		}
		if (h == 1)
		{
		break;
		}
	}
	for (i = 0;i < n;i++)
	{
		for (j = 0;j < n;j++)
		{
			if (sz[i][j] == 0)
			{
				c = i;
			d = j;
			}
		}
	}
	e = (c - a - 1) * (d - b - 1);
	System.out.printf("%d",e);
	return 0;
	}




}

