package <missing>;

public class GlobalMembers
{
	public static int swap(int[] a, int n, int m)
	{
		int i;
		int j;
		int temp;
		if (n >= 0 && n < 5 && m >= 0 && m < 5)
		{
			for (i = 0; i < 5; i++)
			{
				for (j = 0; j < 5; j++)
				{
					temp = a[n][j];
					a[n][j] = a[m][j];
					a[m][j] = temp;
				}
			}
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
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
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		y = swap(a, n, m);
		if (y == 0)
		{
			System.out.print("error\n");
		}
		if (y == 1)
		{
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					System.out.printf("%d",a[i][j]);
					if (j == 4)
					{
					break;
					}
					System.out.print(" ");
				}
				System.out.print("\n");
			}
		}
		return 0;
	}
}

