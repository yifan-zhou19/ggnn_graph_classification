package <missing>;

public class GlobalMembers
{
	public static int mhang(int a)
	{
		return a + 1;
	}
	public static int mlie(int a)
	{
		return a - 1;
	}
	public static int Main()
	{
		int[][] sz = new int[100][100];
		int row;
		int col;
		int i;
		int j;
		int hang = 0;
		int lie = 0;
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
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < col;i++)
		{
			hang = 0;
			lie = i;
			while (true)
			{
				System.out.printf("%d\n",sz[hang][lie]);
				hang = mhang(hang);
				lie = mlie(lie);
				if (hang >= row != 0 || lie < 0)
				{
					break;
				}
			}
		}
		for (i = 1;i < row;i++)
		{
			hang = i;
			lie = col - 1;
			while (true)
			{
				System.out.printf("%d\n",sz[hang][lie]);
				hang = mhang(hang);
				lie = mlie(lie);
				if (hang >= row != 0 || lie < 0)
				{
					break;
				}
			}
		}
		return 0;
	}
}

