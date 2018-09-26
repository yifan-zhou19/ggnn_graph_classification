package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[100][100];
		int j;
		int m;
		int i;
		int k;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < m;i++)
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[j][i] = Integer.parseInt(tempVar3);
			}
			}
		}
		if (m > n)
		{
			k = n;
		}
		else
		{
			k = m;
		}

				for (i = 0;i < (k - 1) / 2;i++)
				{

			for (j = i;j < m - i;j++)
			{
				System.out.printf("%d\n",a[i][j]);
			}
			for (j = i + 1;j < n - i;j++)
			{
				System.out.printf("%d\n",a[j][m - i - 1]);
			}
			for (j = m - i - 2;j >= i;j--)
			{
				System.out.printf("%d\n",a[n - 1 - i][j]);
			}
			for (j = n - i - 2;j > i;j--)
			{
				System.out.printf("%d\n",a[j][i]);
			}
				}
				if (k % 2 == 0)
				{
					i = (k - 1) / 2;
				for (j = i;j < m - i;j++)
				{
				System.out.printf("%d\n",a[i][j]);
				}
			for (j = i + 1;j < n - i;j++)
			{
				System.out.printf("%d\n",a[j][m - i - 1]);
			}
			for (j = m - i - 2;j >= i;j--)
			{
				System.out.printf("%d\n",a[n - 1 - i][j]);
			}
			for (j = n - i - 2;j > i;j--)
			{
				System.out.printf("%d\n",a[j][i]);
			}
				}
				else
				{
					if (m > n)
					{
						i = (n - 1) / 2;
						for (j = i;j < m - i;j++)
						{
				System.out.printf("%d\n",a[i][j]);
						}
					}
					else
					{
						i = (m - 1) / 2;
						for (j = i;j < n - i;j++)
						{
				System.out.printf("%d\n",a[j][m - i - 1]);
						}
					}
				}
				return 0;
	}


}

