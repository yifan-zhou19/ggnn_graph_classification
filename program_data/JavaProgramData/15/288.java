package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[][] a = new int[100][100];
		int num = 0;
		int v;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == 0)
				{
					for (k = j;;k++)
					{
						if (a[i][k] != 0)
						{
							break;
						}
					}
					for (v = i;;v++)
					{
						if (a[v][j] != 0)
						{
							break;
						}
					}
					num = (k - j - 2) * (v - i - 2);
					break;
				}
				if (num != 0)
				{
					break;
				}
			}
		}
			System.out.print(num);
			System.out.print("\n");
			return 0;
	}

}

