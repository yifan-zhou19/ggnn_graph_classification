package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int k;
	int[] sz = new int[N];
	int[][] an = new int[X][Y];
	int i;
	int j;
	int m = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		k = Integer.parseInt(tempVar2);
	}
	for (i = 0;i < n;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		(sz[i]) = Integer.parseInt(tempVar3);
	}
	}
	for (i = 0;i < n;i++)
	{
	for (j = i + 1;j < n;j++)
	{
	an[i][j] = sz[i] + sz[j];
	if (an[i][j] == k)
	{
	m = m + 1;
	}
	}
	}
	if (m == 0)
	{
	System.out.print("no");
	}
	else
	{
	System.out.print("yes");
	}
	return 0;
	}

}

