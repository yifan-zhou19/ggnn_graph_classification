package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int[][] a = new int[5][5];

			for (i = 0;i < 5;i++)
			{
			for (j = 0;j < 5;j++)
			{
				*(*(a + i) + j) = ConsoleInput.readToWhiteSpace(true);
			}
			}
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (m < 5 && n < 5)
		{
			for (i = 0;i < 5;i++)
			{
				if (i == n)
				{
					for (j = 0;j < 4;j++)
					{
						System.out.print(a[m][j]);
						System.out.print(" ");
					}
				System.out.print(a[m][4]);
						System.out.print("\n");
				}
				else if (i == m)
				{
					for (j = 0;j < 4;j++)
					{
						System.out.print(a[n][j]);
						System.out.print(" ");
					}
				   System.out.print(a[n][4]);
				System.out.print("\n");
				}
					else
					{
						for (j = 0;j < 4;j++)
						{
							System.out.print(a[i][j]);
							System.out.print(" ");
						}
					System.out.print(a[i][4]);
					System.out.print("\n");
					}
			}
		}
		else
		{
			System.out.print("error");
		}
	return 0;
	}


}

