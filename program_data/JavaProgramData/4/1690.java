package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[100][100];
		int a;
		int b;
		int row;
		int col;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		for (row = 0;row < a;row++)
		{
			for (col = 0;col < b;col++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[row][col] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < b;i++)
		{
			for (col = i;col >= 0 && (i - col) < a;col--)
			{
				System.out.printf("%d\n",sz[i - col][col]);
			}
		}
		for (i = b;i < a + b;i++)
		{
			for (col = b - 1;col >= 0 && (i - col) < a;col--)
			{
				System.out.printf("%d\n",sz[i - col][col]);
			}
		}
		return 0;
	}
}

