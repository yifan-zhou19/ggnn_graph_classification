package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] a = new int[200][200];
	int i;
	int j;
	int u;
	int t = 0;
	int row;
	int col;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		row = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		col = Integer.parseInt(tempVar2);
	}
	for (i = 0;i < row;i++)
	{
		for (j = 0;j < col;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][j] = Integer.parseInt(tempVar3);
			}
		}

	}
	for (j = 0;j < col;j++)
	{
		for (u = 0;;u++)
		{
			if (u >= row != 0 || j - u < 0)
			{
				break;
			}
			System.out.printf("%d\n",a[u][j - u]);
		}
	}

	for (j = 1;j < row;j++)
	{
		for (u = 1;;u++)
		{
			if (u + j - 1 >= row != 0 || col - u < 0)
			{
				break;
			}

				System.out.printf("%d\n",a[u + j - 1][col - u]);

		}
	}
	return 0;
	}



}

