package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	char c;

	int[][] sz = new int[100][100];
	int row;
	int col;
	int ROW;
	int COL;
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
	System.out.printf("%d\n",sz[0][0]);

	int i = 0;
	int j;
	int k;

	for (j = 1;j < COL;j++)
	{

						for (k = j;k >= 0;k--)
						{
						if (j - k < ROW)
						{
						System.out.printf("%d\n",sz[j - k][k]);
						}
						}
	}
	for (j = COL;j <= COL + ROW;j++)
	{

						for (k = COL - 1;k >= 0;k--)
						{
						if (j - k < ROW)
						{
						System.out.printf("%d\n",sz[j - k][k]);
						}
						}
	}



	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		c = tempVar4.charAt(0);
	}
	return 0;
	}

}

