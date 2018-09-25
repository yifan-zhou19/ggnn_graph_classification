package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int exchange = new int(int b[5][5],int n,int m);
		int[][] a = new int[5][5];
		int n;
		int m;
		int i;
		int j;

		for (i = 0;i < 5;++i)
		{
			for (j = 0;j < 5;++j)
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

		if (exchange(a, n, m) == 1)
		{
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					System.out.printf("%d",a[i][j]);

					if (j != 4)
					{
						System.out.print(" ");
					}
					else
					{
						System.out.print("\n");
					}
				}
			}
		}
		else
		{
			System.out.print("error\n");
		}
	}

	public static int exchange(int[][] b, int n, int m)
	{
		int i;

		if (n > 4 || n < 0 || m>4 || m < 0)
		{
			return 0;
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				int[] c = new int[5];
				c[i] = b[n][i];
				b[n][i] = b[m][i];
				b[m][i] = c[i];
			}
		}

		return 1;
	}
}

