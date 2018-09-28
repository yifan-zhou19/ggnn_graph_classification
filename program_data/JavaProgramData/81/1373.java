package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int reverse = new int(int m,int n);
		int m;
		int n;
		int i;
		int j;
		int count = 0;
		int[][] sz = new int[6][5];
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sz[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		if (reverse(m, n) == 0)
		{
			System.out.print("error\n");
		}
		if (reverse(m, n) == 1)
		{
			for (j = 0;j < 5;j++)
			{
				sz[5][j] = sz[m][j];
				sz[m][j] = sz[n][j];
				sz[n][j] = sz[5][j];
			}
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					System.out.printf("%d",sz[i][j]);
					count++;
					if (count % 5 == 0)
					{
						System.out.print("\n");
					}
					else
					{
						System.out.print(" ");
					}
				}
			}
		}
		return 0;
	}



	public static int reverse(int m,int n)
	{
		if ((m >= 0 && m < 5) && (n >= 0 && n < 5))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}

