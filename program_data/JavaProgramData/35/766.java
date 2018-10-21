package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[10][10];
	public static int Main()
	{
	int row;
	int col;
	int ROW;
	int COL;
	int sum = 0;
	int sum1 = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		ROW = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(",");
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
		a[row][col] = Integer.parseInt(tempVar3);
	}
	}
	}
	for (row = 0;row < ROW;row++)
	{
	for (col = 0;col < COL;col++)
	{
	for (int colcol = 0;colcol < COL;colcol++)
	{
	if (a[row][col] < a[row][colcol])
	{
	sum = 1;
	}
	}
	for (int rowrow = 0;rowrow < ROW;rowrow++)
	{
	if (a[row][col] > a[rowrow][col])
	{
	sum = 1;
	}
	}
	if (sum == 0)
	{
	System.out.printf("%d+%d",row,col);
	sum1 = 1;
	}
	sum = 0;
	}
	}
	if (sum1 == 0)
	{
	System.out.print("No");
	}
	return 0;
	}

}

