package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] array = new int[200][200];
		int r;
		int c;
		int i;
		int j;
		int k = 0;
		int l = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			c = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < r;i++)
		{
			for (j = 0;j < c;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					array[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}

		if (r % 2 == 0 && c % 2 == 0)
		{
			for (k = 0;k < r / 2;k++)
			{
				for (j = k;j < c - 1 - k;j++)
				{
					System.out.printf("%d\n",array[k][j]);
				}
				for (i = k;i < r - 1 - k && k < c - 1 - k;i++)
				{
					System.out.printf("%d\n",array[i][c - 1 - k]);
				}
				for (j = c - 1 - k;j > k;j--)
				{
					System.out.printf("%d\n",array[r - 1 - k][j]);
				}
				for (i = r - 1 - k;i > k && c - 1 - k > k;i--)
				{
					System.out.printf("%d\n",array[i][k]);
				}
			}
		}
		else if (r % 2 != 0 && c % 2 == 0)
		{
			for (k = 0;k < r / 2;k++)
			{
				for (j = k;j < c - 1 - k;j++)
				{
					System.out.printf("%d\n",array[k][j]);
				}
				for (i = k;i < r - 1 - k && k < c - 1 - k;i++)
				{
					System.out.printf("%d\n",array[i][c - 1 - k]);
				}
				for (j = c - 1 - k;j > k;j--)
				{
					System.out.printf("%d\n",array[r - 1 - k][j]);
				}
				for (i = r - 1 - k;i > k && c - 1 - k > k;i--)
				{
					System.out.printf("%d\n",array[i][k]);
				}
			}
			for (j = k;j <= c - 1 - k;j++)
			{
				System.out.printf("%d\n",array[r / 2][j]);
			}

		}
		else if (r % 2 == 0 && c % 2 != 0)
		{
			for (k = 0;k < r / 2;k++)
			{
			for (j = k;j < c - 1 - k;j++)
			{
				System.out.printf("%d\n",array[k][j]);
			}
			for (i = k;i < r - 1 - k && k < c - 1 - k;i++)
			{
				System.out.printf("%d\n",array[i][c - 1 - k]);
			}
			for (j = c - 1 - k;j > k;j--)
			{
				System.out.printf("%d\n",array[r - 1 - k][j]);
			}
			for (i = r - 1 - k;i > k && c - 1 - k > k;i--)
			{
				System.out.printf("%d\n",array[i][k]);
				l = k + 1;
			}
			}
			for (i = c - 1 - l;i <= r - 1 - l;i++)
			{
				System.out.printf("%d\n",array[i][c / 2]);
			}

		}
		else //if (r%2!=0&&c%2!=0)
		{
			for (k = 0;k < r / 2;k++)
			{
				for (j = k;j < c - 1 - k;j++)
				{
					System.out.printf("%d\n",array[k][j]);
				}
				for (i = k;i < r - 1 - k && k < c - 1 - k;i++)
				{
					System.out.printf("%d\n",array[i][c - 1 - k]);
				}
				for (j = c - 1 - k;j > k;j--)
				{
					System.out.printf("%d\n",array[r - 1 - k][j]);
				}
				for (i = r - 1 - k;i > k && c - 1 - k > k;i--)
				{
					System.out.printf("%d\n",array[i][k]);
					l = k + 1;
				}
			}
			if (r >= c)
			{
				for (i = l;i <= r - 1 - l;i++)
				{
					System.out.printf("%d\n",array[i][c / 2]);
				}
			}
			else
			{
				for (j = k;j <= c - 1 - k;j++)
				{
				System.out.printf("%d\n",array[r / 2][j]);
				}
			}

		}


	}

}

