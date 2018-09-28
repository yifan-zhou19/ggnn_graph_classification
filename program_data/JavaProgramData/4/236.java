package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int col;
	int row;
	int[][] array = new int[100][100];
	int a;
	int b;
	int c;
	int d;
	int e;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		row = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		col = Integer.parseInt(tempVar2);
	}
	for (a = 0;a < row;a++)
	{
	for (b = 0;b < col;b++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		array[a][b] = Integer.parseInt(tempVar3);
	}
	}
	}
	for (c = 0;c < col;c++)
	{
	e = c;
	for (d = 0;c >= 0 && d < row;d++, c--)
	{
	System.out.printf("%d\n",array[d][c]);
	}
	c = e;
	}
	for (d = 1;d < row;d++)
	{
	e = d;
	for (c = col - 1;d < row && c >= 0;c--, d++)
	{
	System.out.printf("%d\n",array[d][c]);
	}
	d = e;
	}
	return 0;
	}

}

