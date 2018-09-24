package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[][] matrixx = new int[110][110];
	//?????? 
	public static void Del()
	{
		for (int i = 2;i < n;i++)
		{
			for (int j = 1;j <= n;j++)
			{
				matrixx[i][j] = matrixx[i + 1][j];
			}
		}
		for (int i = 2;i < n;i++)
		{
			for (int j = 1;j <= n;j++)
			{
				matrixx[j][i] = matrixx[j][i + 1];
			}
		}
		return;
	}
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int minnum;
		int sum;
		for (int s = 1;s <= n;s++)
		{
			sum = 0;
			for (int j = 1;j <= n;j++)
			{
				for (int k = 1;k <= n;k++)
				{
					matrixx[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			 for (int x;x < 3000;x++)
			 {
					if (x == 5)
					{
						int y = 0;
						y++;
					}
			 }
			for (int i = 1;i < n;i++)
			{
				for (int j = 1;j <= n;j++)
				{
					for (int k = 1;k <= n;k++)
					{
						if (k == 1)
						{
							minnum = matrixx[j][k];
						}
						else
						{
							minnum = Math.min(minnum,matrixx[j][k]);
						}
					}
					for (int k = 1;k <= n;k++)
					{
						matrixx[j][k] -= minnum;
					}
				}
		 //???? 
			for (int j = 1;j <= n;j++)
			{
				for (int k = 1;k <= n;k++)
				{
					if (k == 1)
					{
						minnum = matrixx[k][j];
					}
					else
					{
						minnum = Math.min(minnum,matrixx[k][j]);
					}
				}
				for (int k = 1;k <= n;k++)
				{
					matrixx[k][j] -= minnum;
				}
			}
				sum += matrixx[2][2];
				Del();
			}
			System.out.print(sum);
			System.out.print("\n");
		}

		return 0;
	}

}

