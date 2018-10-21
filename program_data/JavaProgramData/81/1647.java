package <missing>;

public class GlobalMembers
{
	public static int change(int[][] a, int b, int c)
	{
		int i;
		int[] w = new int[5];
		if ((b >= 0 && b < 5) && (c >= 0 && c < 5))
		{
			for (i = 0;i < 5;i++)
			{
				w[i] = a[b][i];
				a[b][i] = a[c][i];
				a[c][i] = w[i];
			}
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static int Main()
	{
		int i;
		int j;
		int[][] t = new int[5][5];
		int n;
		int m;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					t[i][j] = Integer.parseInt(tempVar);
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
		int p;
		p = change(t, n, m);
		if (p == 0)
		{
			System.out.print("error");
		}
		else if (p == 1)
		{
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					System.out.printf("%d",t[i][j]);
					if (i != 4 && j == 4)
					{
						System.out.print("\n");
					}
					else if (i == 4 && j == 4)
					{
						break;
					}
					else
					{
						System.out.print(" ");
					}
				}
			}
		}
		return 0;
	}




}

