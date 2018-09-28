package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int n;
	int i;
	int j;
	int k;
	int[][] a = new int[100][100];
	int x1;
	int x2;
	int y1;
	int y2;
	int s = 0;
	int t = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	x1 = 0;
	x2 = n - 1;
	y1 = 0;
	y2 = m - 1;
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
	i = 0;
	j = 0;
	for (k = 0;k < m * n;k++)
	{
	System.out.printf("%d\n",a[i][j]);
	if ((i == y1) && (j < x2))
	{
	j++;
	}
	else if ((j == x2) && (i < y2))
	{
	i++;
	}
	else if ((i == y2) && (j > x1))
	{
	j--;
	}
	else if ((j == x1) && (i == y1 + 1))
	{
	j++;
	x1++;
	x2--;
	y1++;
	y2--;
	}
	else
	{
	i--;
	}


	}

	return 0;
	}


}

