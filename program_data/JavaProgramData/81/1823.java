package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[6][6];
		int i;
		int j;
		int k;
		int n;
		int m;
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (n >= 5 || n < 0 || m >= 5 || m < 0)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				if (i == n)
				{
					for (j = 0;j < 4;j++)
					{
						System.out.printf("%d ",a[m][j]);
					}
					System.out.printf("%d\n",a[m][4]);
				}
				else if (i == m)
				{
					for (j = 0;j < 4;j++)
					{
						System.out.printf("%d ",a[n][j]);
					}
					System.out.printf("%d\n",a[n][4]);
				}
				else
				{
					for (j = 0;j < 4;j++)
					{
						System.out.printf("%d ",a[i][j]);
					}
					System.out.printf("%d\n",a[i][4]);
				}
			}
		}
	}
}

