package <missing>;

public class GlobalMembers
{
	//??C???
	public static int Main()
	{
		char[][] a = new char[100][20];
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			for (j = 0;a[i][j] != '\0';j++)
			{
				if (j == 0) //???????
				{
					if ((a[i][0] >= 'a' && a[i][0] <= 'z') || (a[i][0] >= 'A' && a[i][0] <= 'Z') || a[i][0] == '_')
					{
						continue;
					}
					else
					{
						System.out.print("no");
						System.out.print("\n");
						break;
					}
				}
				else //????????
				{
					if ((a[i][j] >= 'a' && a[i][j] <= 'z') || (a[i][j] >= 'A' && a[i][j] <= 'Z') || a[i][j] == '_' || (a[i][j] >= '0' && a[i][j] <= '9'))
					{
						if (a[i][j + 1] != '\0')
						{
							continue;
						}
						else
						{
							System.out.print("yes");
							System.out.print("\n");
						}
					}
					else
					{
						System.out.print("no");
						System.out.print("\n");
						break;
					}
				}
			}
		}
		return 0;
	}
}

