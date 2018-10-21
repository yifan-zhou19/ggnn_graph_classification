package <missing>;

public class GlobalMembers
{
	//**********************************************************
	//*   ?  ?   ?: ????.cpp                            *
	//*   ?       ?: ? ?                                   *
	//*   ? ? ? ?: 2010?10?12?                          *
	//**********************************************************
	public static int Main()
	{
		int n = 0;
		int i = 0;
		int j = 0;
		int[][] a = new int[100][100];
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 100;j++)
			{
				a[i][j] = 0;
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j <= a[i][0];j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 99;j >= 1;j--)
			{
				if (a[i][0] == 0)
				{
					System.out.print(60);
					System.out.print("\n");
					break;
				}
				else if (a[i][j] != 0)
				{
					if (((a[i][j] + j * 3) <= 60) && (a[i][j + 1] == 0))
					{
						System.out.print(60 - j * 3);
						System.out.print("\n");
						break;
					}
					else if (((a[i][j] + j * 3) <= 60) && ((a[i][j + 1] + j * 3) >= 60) && a[i][j + 1] != 0)
					{
						System.out.print(60 - j * 3);
						System.out.print("\n");
						break;
					}
					else if (((a[i][j] + j * 3) <= 60) && ((a[i][j + 1] + j * 3) < 60))
					{
						System.out.print(a[i][j + 1]);
						System.out.print("\n");
						break;
					}
				}
			}
		}
		return 0;
	}
}

