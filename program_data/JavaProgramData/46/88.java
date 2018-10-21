package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int row;
	int col;
	int i;
	int j;
	int[][] ss = new int[100][100];
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
		(ss[i][j]) = Integer.parseInt(tempVar3);
	}
	}
	}
	for (int k = 0;k < (col + 1) / 2 && k < (row + 1) / 2;k++)
	{
	for (j = k;j < col - k;j++)
	{
	System.out.printf("%d\n",ss[k][j]);
	}
	if (k + 1 >= row - k)
	{
	break;
	}
	for (i = k + 1;i < row - k;i++)
	{
	System.out.printf("%d\n",ss[i][col - k - 1]);
	}
	if (col - k - 2 < k)
	{
	break;
	}
			for (j = col - k - 2;j >= k;j--)
			{
	System.out.printf("%d\n",ss[row - k - 1][j]);
			}
	if (row - k - 2 < k + 1)
	{
	break;
	}
	for (i = row - k - 2;i >= k + 1;i--)
	{
	System.out.printf("%d\n",ss[i][k]);
	}
	}
		return 0;
	}

}

