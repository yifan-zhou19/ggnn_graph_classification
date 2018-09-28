package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[1000][1000];
		int row;
		int col;
		int i;
		int j;
		int k;
		for (i = 0;i < 1000;i++)
		{
			for (j = 0;j < 1000;j++)
			{
				a[i][j] = -12345;
			}
		}
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
						a[i][j] = Integer.parseInt(tempVar3);
					}
				}
			}
				for (j = 0;j < 1000;j++)
				{
					for (k = j,i = 0;k >= 0;k--,i++)
					{
						if (a[i][k] != -12345)
						{
						System.out.printf("%d\n", a[i][k]);
						}
					}
				}





				return 0;



	}
}

