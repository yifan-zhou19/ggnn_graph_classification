package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int m1;
		int m2;
		int n1;
		int n2;
		int i;
		int j;
		int[][] a = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}

		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}

		m1 = m - 1;
		n1 = n - 1;
		m2 = 0;
		n2 = 0;
		while (m1 > m2 && n1 > n2)
		{
			for (i = m2,j = n2;j < n1;j++)
			{
				System.out.printf("%d\n",a[i][j]);
			}

			for (i = m2,j = n1;i < m1;i++)
			{
				System.out.printf("%d\n",a[i][j]);
			}

			for (i = m1,j = n1;j > n2;j--)
			{
				System.out.printf("%d\n",a[i][j]);
			}

			for (i = m1,j = n2;i > m2;i--)
			{
				System.out.printf("%d\n",a[i][j]);
			}
			m1--;
			n1--;
			m2++;
			n2++;
		}
		if (m1 == m2 && n1 == n2)
		{
			System.out.printf("%d\n",a[m1][n1]);
		}
		else if (m1 == m2)
		{
			for (j = n2;j <= n1;j++)
			{
				System.out.printf("%d\n",a[m1][j]);
			}
		}
			else
			{
				for (i = m2;i <= m1;i++)
				{
					System.out.printf("%d\n",a[i][n1]);
				}
			}
	}











}

