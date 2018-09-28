package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[max + 2][max + 2];
		int i;
		int j;
		int m;
		int n;
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][j] = Integer.parseInt(tempVar3);
			}
			}
		}
		 for (i = 1;i <= m;i++)
		 {
			for (j = 1;j <= n;j++)
			{
				if (a[i + 1][j] <= a[i][j] != 0 && a[i - 1][j] <= a[i][j] != 0 && a[i][j + 1] <= a[i][j] != 0 && a[i][j - 1] <= a[i][j])
				{
				x = i - 1;
				y = j - 1;
				System.out.printf("%d %d\n",x,y);
				}
			}
		 }
		 return 0;

	}
}

