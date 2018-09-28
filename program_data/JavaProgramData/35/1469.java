package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[10][10];
	public static int Main()
	{
		int n;
		int m;
		int f = 0;
		int y;
		int x;
		int c;
		int i;
		int b = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (y = 0;y < n;y++)
		{
			for (x = 0;x < m;x++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[y][x] = Integer.parseInt(tempVar3);
				}

			}

		}
		for (y = 0;y < n;y++)
		{
			for (x = 0;x < m;x++)
			{
				if (b < a[y][x])
				{
					c = x;
					b = a[y][x];
				}

			}
			for (i = 0;i < n;i++)
			{
				if (a[i][c] < b)
				{
					break;
				}
			}
			if (i == n)
			{
				f = 1;
				System.out.printf("%d+%d",y,c);
			}
		}
		 if (f == 0)
		 {
		System.out.print("No");
		 }
		return 0;
	}

}

