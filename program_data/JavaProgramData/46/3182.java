package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		int k;
		int q;
		int p;
		int[][] a = new int[100][100];
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
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < ((n + 1) / 2);i++)
		{
			for (j = i;j < m - i;j++)
			{
				System.out.printf("%d\n",a[i][j]);
			}

			for (k = i + 1;k < (n - i) && i < (m - i);k++)
			{
				System.out.printf("%d\n",a[k][m - 1 - i]);
			}

			for (p = (m - i - 2);p >= i != 0 && (i + 1) < (n - i);p--)
			{
				System.out.printf("%d\n",a[n - i - 1][p]);
			}

			for (q = n - i - 2;q > i && (m - i - 2) >= i;q--)
			{
				System.out.printf("%d\n",a[q][i]);
			}


		}
		return 0;
	}



}

