package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int ROW;
	int COL;
	int row;
	int col;
	int k;
	int i;
	int j;
	int[][] sz = new int[101][101];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		ROW = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		COL = Integer.parseInt(tempVar2);
	}
	for (row = 0;row < ROW;row++)
	{
	for (col = 0;col < COL;col++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		sz[row][col] = Integer.parseInt(tempVar3);
	}
	}
	}
	for (k = 0; k < COL; k++)
	{
	for (i = 0, j = k; i < ROW && j >= 0; i++, j--)
	{
	System.out.printf("%d\n",sz[i][j]);
	}
	}
	for (k = 1; k < ROW; k++)
	{
	for (i = k, j = COL - 1; i < ROW && j >= 0; i++, j--)
	{
	System.out.printf("%d\n",sz[i][j]);
	}
	}
	return 0;
	}

}

