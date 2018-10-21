package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int x;
		for (i = 0;i < 5;i++)
		{
		for (j = 0;j < 5;j++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i][j] = Integer.parseInt(tempVar);
			}
		}
		}
		for (i = 0;i < 5;i++)
		{
		for (j = 0;j < 5;j++)
		{
			int flag = 1;
			for (x = 0;x < 5;x++)
			{
				if ((a[i][x] > a[i][j]) || (a[x][j] < a[i][j]))
				{
					flag = 0;
					break;
				}
			}
			if (flag != 0)
			{
				System.out.printf("%d %d %d",i + 1,j + 1,a[i][j]);
				return 0;
			}
		}
		}
		System.out.print("not found");
		return 0;
	}

}

