package <missing>;

public class GlobalMembers
{
	public static int[][] h = new int[20][20];
	public static int sort(int l,int r)
	{
		if (l > 0)
		{
		if (h[l - 1][r] > h[l][r])
		{
	return 0;
		}
		}
	if (l < 19)
	{
		if (h[l + 1][r] > h[l][r])
		{
	return 0;
		}
	}
	if (r > 0)
	{
		if (h[l][r - 1] > h[l][r])
		{
	return 0;
		}
	}
	if (r < 19)
	{
		if (h[l][r + 1] > h[l][r])
		{
	return 0;
		}
	}
	return 1;
	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	for (i = 0;i < m;i++)
	{
			for (j = 0;j < n;j++)
			{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			h[i][j] = Integer.parseInt(tempVar3);
		}
			}
	}
	for (i = 0;i < m;i++)
	{
			for (j = 0;j < n;j++)
			{
		if (sort(i, j) == 1)
		{
	System.out.printf("%d %d\n",i,j);
		}
			}
	}
	}
}

