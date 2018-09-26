package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] a = new int[5][5];
	int i;
	int j;
	int k;
	int y;
	int f;
	int x;
	k = 0;
	for (i = 0;i < 5;i++)
	{
	for (j = 0;j < 5;j++)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		(a[i][j]) = Integer.parseInt(tempVar);
	}
	}
	}
	for (i = 0;i < 5;i++)
	{
	y = a[i][0];
	x = 0;
	for (j = 1;j < 5;j++)
	{
	if (a[i][j] > y)
	{
	y = a[i][j];
	x = j;
	}
	}
	for (f = 0;f < 5;f++)
	{
	if (a[i][x] > a[f][x])
	{
	k = 1;
	}
	}
	if (k == 0)
	{
	System.out.printf("%d %d %d",i + 1,x + 1,a[i][x]);
	break;
	}
	k = 0;
	if (i == 4)
	{
	System.out.print("not found");
	}
	}
	return 0;
	}

}

