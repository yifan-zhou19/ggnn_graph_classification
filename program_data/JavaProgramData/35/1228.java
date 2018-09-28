package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int r;
		int c;
		int i;
		int j;
		int k;
		int[][] a = new int[8][8];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			c = Integer.parseInt(tempVar2);
		}
		for (i = 0; i < r; i++)
		{
			for (j = 0; j < c; j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}

		for (i = 0;i < r;i++)
		{
			for (j = 0,k = 0;j < c;j++)
			{
				if (a[i][j] > a[i][k])
				{
					k = j;
				}
			}
			for (j = 0;j < r;j++)
			{
				if (a[i][k] > a[j][k])
				{
					break;
				}
			}
			if (j == r)
			{
				System.out.printf("%d+%d",i,k);
				break;
			}
		}
		if (i == r)
		{
			System.out.print("No");
		}


		return 0;
	}
}

