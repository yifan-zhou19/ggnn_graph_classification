package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[][] sz = new int[n][2];
	for (int i = 0;i < n;i++)
	{
	for (int j = 0;j < 2;j++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		sz[i][j] = Integer.parseInt(tempVar2);
	}
	}
	}
	int sum1 = 0;
	int sum2 = 0;
	for (int i = 0;i < n;i++)
	{
	if (sz[i][0] - sz[i][1] == -1 || sz[i][0] - sz[i][1] == 2)
	{
	sum1++;
	}
	else if (sz[i][0] - sz[i][1] == 1 || sz[i][0] - sz[i][1] == -2)
	{
	sum2++;
	}
	}
	if (sum1 > sum2)
	{
	System.out.print("A");
	}
	else if (sum1 < sum2)
	{
	System.out.print("B");
	}
	else
	{
	System.out.print("Tie");
	}
	return 0;
	}

}

