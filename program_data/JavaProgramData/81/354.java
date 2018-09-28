package <missing>;

public class GlobalMembers
{
	public static int swap(int[][] b, int n, int m)
	{
		int c;
		int x;
		if (m >= 0 && m < 5 && n >= 0 && n < 5)
		{
			for (x = 0;x < 5;x++)
			{
				c = b[m][x],b[m][x] = b[n][x],b[n][x] = c;
			}
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static void Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int n;
		int m;
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
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (swap(a, n, m) == 0)
		{
			System.out.print("error\n");
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				System.out.printf("%d",a[i][0]);
				for (j = 1;j < 5;j++)
				{
					System.out.printf("%2d",a[i][j]);
				}
				System.out.print("\n");
			}
		}
	}
}

