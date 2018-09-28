package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int c;
		int b;
		int i;
		int j;
		int e;
		int f;
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
				e = 0;
				f = 0;
				for (c = 0;c < 5;c++)
				{
					if (a[i][j] >= a[i][c])
					{
						e++;
					}
				}
				for (b = 0;b < 5;b++)
				{
					if (a[i][j] <= a[b][j])
					{
						f++;
					}
				}
				if (e == 5 && f == 5)
				{
					System.out.printf("%d %d %d",i + 1,j + 1,a[i][j]);
					break;
				}
			}
			if (e == 5 && f == 5)
			{
				break;
			}
		}
		if (e != 5 || f != 5)
		{
			System.out.print("not found");
		}
		return 0;
	}
}

