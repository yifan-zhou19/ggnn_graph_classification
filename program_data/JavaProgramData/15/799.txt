package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x = 2;
		int y = 2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] a = new int[ROW][COL];
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i][j] = Integer.parseInt(tempVar2);
			}
			}
		}
		for (i = 0;i < n;i++)
		{

			for (j = 0;j < n;j++)
			{
				if (a[i][j] == 0 && a[i][j + 1] == 0)
				{
				x++;
				}
			}
		}
		for (j = 0;j < n;j++)
		{

			for (i = 0;i < n;i++)
			{
				if (a[i][j] == 0 && a[i + 1][j] == 0)
				{
				y++;
				}
			}
		}
		int s;
		s = (x / 2 - 2) * (y / 2 - 2);
		System.out.printf("%d",s);
		return 0;
	}



}

