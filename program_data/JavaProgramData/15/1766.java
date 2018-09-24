package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int Row = 100;
	int Col = 100;
	int[][] sz = new int[Row][Col];
	int n;
	int row1;
	int row2;
	int i;
	int col1;
	int col2;
	int k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	for (k = 0;k < n;k++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		sz[i][k] = Integer.parseInt(tempVar2);
	}
	}
	}
	int judge = 0;
	for (i = 0;judge == 0 && i < n;i++)
	{
	for (k = 0;judge == 0 && k < n;k++)
	{
	if (sz[i][k] == 0)
	{
	judge = 1;

	row1 = i;

	col1 = k;
	}
	}
	}
	for (i = n - 1;judge == 1 && i > 0;i--)
	{
	for (k = n - 1;judge == 1 && k > 0;k--)
	{
	if (sz[i][k] == 0)
	{

	row2 = i;

	col2 = k;
	judge = 0;
	}
	}
	}
	int s;
	s = (row2 - row1 - 1) * (col2 - col1 - 1);
	System.out.printf("%d",s);
	return 0;
	}
}

