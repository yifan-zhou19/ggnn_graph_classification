package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] a = new int[5][5];
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
		if (m == n || m > 4 || m < 0 || n>4 || n < 0)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				if (i == m)
				{
						System.out.printf("%d",a[n][0]);
				}
					else if (i == n)
					{
						System.out.printf("%d",a[m][0]);
					}
					else
					{
						System.out.printf("%d",a[i][0]);
					}
				for (j = 1;j < 5;j++)
				{
					if (i == m)
					{
						System.out.printf(" %d",a[n][j]);
					}
					else if (i == n)
					{
						System.out.printf(" %d",a[m][j]);
					}
					else
					{
						System.out.printf(" %d",a[i][j]);
					}
				}
				System.out.print("\n");
			}
		}
		return 0;
	}


}

