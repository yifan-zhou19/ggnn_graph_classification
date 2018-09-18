package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] a = new int[100][100];
	int x1;
	int y1;
	int x2;
	int y2;
	int area = 0;
	int n;
	int i;
	int j;
	/* ??n*n?? */
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0; i < n; i++)
	{
	for (j = 0; j < n; j++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i][j] = Integer.parseInt(tempVar2);
	}
	}
	}
	/* ?????? */
	for (i = 0; i < n; i++)
	{
	for (j = 0; j < n; j++)
	{
	/* ??????0???????? */
	if (a[i][j] == 0)
	{
	x1 = i;
	y1 = j;
	break;
	}
	}
	if (j < n)
	{
	break;
	}
	}
	/* ?????? */
	for (i = n - 1; i >= 0; i--)
	{
	for (j = n - 1; j >= 0; j--)
	{
	/* ??????0???????? */
	if (a[i][j] == 0)
	{
	x2 = i;
	y2 = j;
	break;
	}
	}
	if (j >= 0)
	{
	break;
	}
	}
	/* ??????????? */
	area = (x2 - x1 - 1) * (y2 - y1 - 1);
	System.out.printf("%d", area);
	return 0;
	}

}

