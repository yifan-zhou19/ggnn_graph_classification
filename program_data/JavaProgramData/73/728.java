package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int t = 0;
		int x;
		int y;
		int[][] a = new int[5][5];
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
			x = a[i][0];
			y = 0;
			for (j = 0;j < 5;j++)
			{
				if (a[i][j] > x)
				{
					x = a[i][j];
					y = j;
				}
			}
			for (k = 0;k < 5;k++)
			{
				if (a[k][y] < x)
				{
					x = 0;
					break;
				}
			}
			if (x != 0)
			{
				System.out.printf("%d %d %d",i + 1,y + 1,x);
				t = 1;
			}
		}
		if (t == 0)
		{
			System.out.print("not found");
		}
		System.in.read();
		System.in.read();
		System.in.read();
		return 0;
	}

}

