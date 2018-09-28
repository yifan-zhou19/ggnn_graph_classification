package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[5][5];
		int m;
		int n;
		int e;
		int row;
		int col;
	for (row = 0;row < 5;row++)
	{
	for (col = 0;col < 5;col++)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		sz[row][col] = Integer.parseInt(tempVar);
	}
	}
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		n = Integer.parseInt(tempVar3);
	}
	if (m < 5 && n < 5)
	{
		for (int col = 0;col < 5;col++)
		{
			e = sz[m][col];
			sz[m][col] = sz[n][col];
			sz[n][col] = e;
		}
	}
	if (m < 5 && n < 5)
	{
		for (row = 0;row < 5;row++)
		{
	for (col = 0;col < 5;col++)
	{
	System.out.printf("%d",sz[row][col]);
	if (col < 4)
	{
		System.out.print(" ");
	}
	}

	System.out.print("\n");
		}
	}
	if (m > 4 || n > 4)
	{
		System.out.print("error");
	}
	return 0;
	}


}

