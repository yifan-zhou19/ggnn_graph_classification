package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[][] a = new int[10][10];
		int i;
		int j;
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
		int n;
		int m;
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
		if ((m >= 0 && m < 5) && (n >= 0 && n < 5))
		{
			int[][] t = new int[1][5];

				for (j = 0;j < 5;j++)
				{
					t[0][j] = a[n][j];
				}
				for (j = 0;j < 5;j++)
				{
					a[n][j] = a[m][j];
				}
				for (j = 0;j < 5;j++)
				{
					a[m][j] = t[0][j];
				}


			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					if (j == 4)
					{
						System.out.printf("%d",a[i][j]);
					}
					else
					{
					System.out.printf("%d ",a[i][j]);
					}
				}
				System.out.print("\n");
			}
		}
		else
		{
			System.out.print("error");
		}

	}

}

