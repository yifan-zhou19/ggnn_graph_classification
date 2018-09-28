package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int i;
		int j;
		int r;
		int c;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < r;i++)
		{
			for (j = 0;j < c;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (s = 0;s < r + c - 1;s++)
		{
			for (i = 0;i <= s;i++)
			{
				if (i <= r - 1 && s - i <= c - 1)
				{
					if (i == 0 && s - i == 0)
					{
						System.out.printf("%d",a[0][0]);
					}
					else
					{
						System.out.printf("\n%d",a[i][s - i]);
					}
				}
			}
		}
		System.out.print("\n");
		return 0;
	}
}

