package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int n;
	int i;
	int j;
	int d;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(",");
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	int[][] a = new int[7][7];
	for (i = 0;i < m;i++)
	{
	for (j = 0;j < n;j++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[i][j] = Integer.parseInt(tempVar3);
	}
	}
	}
	for (i = 0;i < m;i++)
	{
	int y = 0;
	int max = a[i][0];
	for (j = 0;j < n;j++)
	{
	if (max < a[i][j])
	{
	max = a[i][j];
	y = j;
	}
	}
	int x = 0;
	int min = a[0][y];
	for (int k = 0;k < m;k++)
	{
	if (min > a[k][y])
	{
	min = a[k][y];
	x = k;
	}
	}
	if (i == x)
	{
		System.out.printf("%d+%d",i,y);
	break;
	}
	else
	{
	d = 1;
	continue;
	}
	}
	if (d == 1)
	{
	System.out.print("No");
	}
	return 0;
	}

}

