package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int[][] a = new int[100][15];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			a[i][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int j = 1;j <= a[i][0];j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int i = 0;i < n;i++)
		{
			if (a[i][0] == 0)
			{
				System.out.print(60);
				System.out.print("\n");
			}
			else
			{
				int num = a[i][a[i][0]] + a[i][0] * 3;
				if (num <= 60)
				{
					System.out.print(60 - 3 * a[i][0]);
					System.out.print("\n");
				}
				else if (num <= 63)
				{
					System.out.print(a[i][a[i][0]]);
					System.out.print("\n");
				}
				else
				{
					int j = 1;
					for (j = 1;j <= a[i][0];j++)
					{
						num = a[i][j] + j * 3;
						if (num >= 60 && num <= 63)
						{
							System.out.print(a[i][j]);
							System.out.print("\n");
							break;
						}
						else if (num > 63)
						{
							System.out.print(63 - j * 3);
							System.out.print("\n");
							break;
						}
					}
				}
			}
		}
		return 0;
	}

}

