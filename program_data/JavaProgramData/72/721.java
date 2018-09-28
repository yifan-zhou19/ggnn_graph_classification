package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int m;
		int n;
		int i;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 0;j < m;j++)
		{
			for (i = 0;i < n;i++)
			{
				a[j][i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (j = 0;j < m;j++)
		{
			for (i = 0;i < n;i++)
			{
				if (j == 0 && i != 0)
				{
					if (a[j][i] >= a[j][i - 1] != 0 && a[j][i] >= a[j][i + 1] != 0 && a[j][i] >= a[j + 1][i])
					{
						System.out.print(j);
						System.out.print(" ");
						System.out.print(i);
						System.out.print("\n");
					}
				}
				else if (j == 0 && i == 0)
				{
					if (a[j][i] >= a[j][i + 1] != 0 && a[j][i] >= a[j + 1][i])
					{
						System.out.print(j);
						System.out.print(" ");
						System.out.print(i);
						System.out.print("\n");
					}
				}
				else if (a[j][i] >= a[j][i - 1] != 0 && a[j][i] >= a[j][i + 1] != 0 && a[j][i] >= a[j - 1][i] != 0 && a[j][i] >= a[j + 1][i])
				{
					   System.out.print(j);
					   System.out.print(" ");
					   System.out.print(i);
					   System.out.print("\n");
				}
			}
		}
			return 0;
	}
}

