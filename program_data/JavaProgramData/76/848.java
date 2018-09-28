package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int q = 0;
	int n;
	int[][] sz = new int[50000][2];
	int[] sz1 = new int[50000];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	for (j = 0;j <= 1;j++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		sz[i][j] = Integer.parseInt(tempVar2);
	}
	}
	}
	int max = sz[0][1];
	int min = sz[0][0];

	for (i = 0;i < n;i++)
	{
	if (sz[i][1] > max)
	{
	max = sz[i][1];
	}

	}

	for (i = 0;i < n;i++)
	{
	if (sz[i][0] < min)
	{
	min = sz[i][0];

	}
	}
	for (i = min * 2;i < max * 2;i++)
	{
	sz1[i] = 1;
	}
	for (i = 0;i < n;i++)
	{
	for (j = (sz[i][0] * 2);j <= (sz[i][1] * 2);j++)
	{
		sz1[j] = 0;
	}
	}
	for (i = min * 2;i <= max * 2;i++)
	{
	if (sz1[i] == 1)
	{
	System.out.print("no");
	q = 1;
	break;
	}
	}
	if (q == 0)
	{
	System.out.printf("%d %d",min,max);
	}
	return 0;
	}

}

