package <missing>;

public class GlobalMembers
{
	public static int func(int[][] a, int m, int n)
	{
		if (m > 4 || n > 4)
		{
			return 0;
		}

		else
		{
			int[] b = new int[5];
			int i;
			for (i = 0;i < 5;i++)
			{
				b[i] = a[m][i];
				a[m][i] = a[n][i];
				a[n][i] = b[i];
			}
			return 1;
		}
	}

	public static void Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int m;
		int n;
		int c;
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
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}

		c = func(a, m, n);
		if (c == 0)
		{
			System.out.print("error");
		}
		if (c == 1)
		{
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					System.out.printf("%d",a[i][j]);
					if (j < 4)
					{
						System.out.print(" ");
					}
				}
				System.out.print("\n");
			}
		}
	}

}

