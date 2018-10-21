package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] a = new int[5][5];
	int i;
	int j;
	int p;

	int x1;
	int x2;
	int c = 0;
	int m = 0;
	int tmp = 0;



	for (i = 0;i < 5;i++)
	{
	for (j = 0;j < 5;j++)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a[i][j] = Integer.parseInt(tempVar);
	}
	}
	}

	for (i = 0;i < 5;i++)
	{
	tmp = 0;
	for (j = 0;j < 5;j++)
	{
	if (a[i][j] > tmp)
	{
	tmp = a[i][j];
	x1 = i;
	x2 = j;
	}
	}

	m = 0;
	for (p = (x1 - 1);p >= 0;p--)
	{
	if (a[p][x2] < a[x1][x2])
	{
	m++;
	break;
	}
	}
	for (p = (x1 + 1);p < 5;p++)
	{
	if (a[p][x2] < a[x1][x2])
	{
	m++;
	break;
	}
	}
	if (m == 0)
	{
	System.out.printf("%d %d %d\n",x1 + 1,x2 + 1,a[x1][x2]);
	c++;
	}
	}

	if (c == 0)
	{
	System.out.print("not found");
	}

	return 0;
	}
}

