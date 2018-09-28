package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[101][101]; //??a??????????b????????????
		int r;
		int c;
		int[] b = new int[10000];
		r = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i <= r - 1;i++) //????
		{
			for (int j = 0;j <= c - 1;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
			int e = 1;
			int w1 = 0;
			int w2 = 0;
			int w3 = 0;
			int w4 = 0;
			int p = 1;
			for (int k = 1;k <= 100000;k++) //?????????????b?
			{
				if (e == 1) //??????
				{
					for (int i = w4;i <= c - 1 - w2;i++)
					{
						b[p] = a[w1][i];
						p = p + 1;
					}
					w1++;
					e = 2;
					if (w2 + w4 == c || w1 + w3 > r)
					{
						for (int j = 1;j <= p - 1;j++)
						{
							System.out.print(b[j]);
							System.out.print("\n");
						}
						break;
					}
				}
				if (e == 2) //??????
				{
					for (int i = w1;i <= r - 1 - w3;i++)
					{
						b[p] = a[i][c - 1 - w2];
						p++;
					}
					w2++;
					e = 3;
					if (w2 + w4 > c || w1 + w3 == r)
					{
						for (int j = 1;j <= p - 1;j++)
						{
							System.out.print(b[j]);
							System.out.print("\n");
						}
						break;
					}
				}
				if (e == 3) //??????
				{
					for (int i = c - w2 - 1;i >= w4;i--)
					{
						b[p] = a[r - w3 - 1][i];
						p++;
					}
					w3++;
					e = 4;
					if (w2 + w4 == c || w1 + w3 > r)
					{
						for (int j = 1;j <= p - 1;j++)
						{
							System.out.print(b[j]);
							System.out.print("\n");
						}
						break;
					}
				}
				if (e == 4) //??????
				{
					for (int i = r - w3 - 1;i >= w1;i--)
					{
						b[p] = a[i][w4];
						p++;
					}
					w4++;
					 e = 1;
					if (w2 + w4 > c || w1 + w3 == r)
					{
						for (int j = 1;j <= p - 1;j++)
						{
							System.out.print(b[j]);
							System.out.print("\n");
						}
						break;
					}
				}
			}
			return 0;
	}
}

