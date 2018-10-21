package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[][] a = new int[100][100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int sum1 = 0;
		int sum2 = 0;
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (a[i][j] == 0)
				{
					for (k = 1;;k++)
					{
						if (a[i][j + k] == 0)
						{
							sum1++;
						}
						else
						{
							break;
						}
					}
					for (k = 1;;k++)
					{
						if (a[i + k][j] == 0)
						{
							sum2++;
						}
						else
						{
							break;
						}
					}
					break;
				}
				if (sum1 != 0)
				{
					break;
				}
			}
		}
		System.out.print((sum1 - 1) * (sum2 - 1));
		System.out.print("\n");
		return 0;
	}
}

