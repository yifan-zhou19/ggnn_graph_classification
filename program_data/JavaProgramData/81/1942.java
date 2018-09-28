package <missing>;

public class GlobalMembers
{
	public static int pd(int n,int m)
	{
		if (n <= 4 && n >= 0 && m <= 4 && m >= 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static void Main(String[] args)
	{
		int[][] a = new int[5][5];
		int[] b = new int[5];
		int i;
		int j;
		int m;
		int n;
		for (i = 0;i <= 4;i++)
		{
			for (j = 0;j <= 4;j++)
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
		if (pd(n, m) == 0)
		{
			System.out.print("error");
		}
		if (pd(n, m) == 1)
		{
			for (j = 0;j <= 4;j++)
			{
			b[j] = a[m][j];
			a[m][j] = a[n][j];
			a[n][j] = b[j];
			}
			for (i = 0;i <= 4;i++)
			{
			for (j = 0;j <= 4;j++)
			{
				System.out.printf("%d",a[i][j]);
				if (j == 4)
				{
					System.out.print("\n");
				}
				if (j != 4)
				{
					System.out.print(" ");
				}
			}
			}
		}

	}


}

