package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int m;
		int i;
		int j;
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

		if (n < 5 && n >= 0 && m < 5 && m >= 0)
		{
			for (i = 0;i < n;i++)
			{
				System.out.printf("%d",a[i][0]);
				for (j = 1;j < 5;j++)
				{
					System.out.printf(" %d",a[i][j]);
				}
				System.out.print("\n");
			}
			System.out.printf("%d",a[m][0]);
			for (j = 1;j < 5;j++)
			{
				System.out.printf(" %d",a[m][j]);
			}
			System.out.print("\n");
			for (i = n + 1;i < m;i++)
			{
				System.out.printf("%d",a[i][0]);
				for (j = 1;j < 5;j++)
				{
					System.out.printf(" %d",a[i][j]);
				}
				System.out.print("\n");
			}
			System.out.printf("%d",a[n][0]);
			for (j = 1;j < 5;j++)
			{
				System.out.printf(" %d",a[n][j]);
			}
			System.out.print("\n");
			for (i = m + 1;i < 5;i++)
			{
				System.out.printf("%d",a[i][0]);
				for (j = 1;j < 5;j++)
				{
					System.out.printf(" %d",a[i][j]);
				}
				System.out.print("\n");
			}
		}
		else
		{
			System.out.print("error\n");
		}

	}
}

