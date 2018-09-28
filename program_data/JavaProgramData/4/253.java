package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int[][] sz = new int[100][100];
		int i;
		int j;
		int a;
		int b;
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
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < col;i++)
		{
			a = i;
			b = 0;
			for (j = 0;j <= i;j++)
			{
				System.out.printf("%d\n", sz[b][a]);
				b++;
				a--;
				if (b == row)
				{
					break;
				}
			}
		}
		for (i = 1;i < row;i++)
		{
			b = i;
			a = col - 1;
			for (j = i;j < row;j++)
			{
				System.out.printf("%d\n", sz[b][a]);
				b++;
				a--;
				if (a == -1)
				{
					 break;
				}
			}

		}
		return 0;
	}
}

