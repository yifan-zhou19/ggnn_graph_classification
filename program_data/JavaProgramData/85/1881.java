package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[100][21];
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		cin.ignore();
		for (i = 0;i < n;i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		for (i = 0;i < n;i++)
		{
			if (!((a[i][0] >= 'a' && a[i][0] <= 'z') || (a[i][0] >= 'A' && a[i][0] <= 'Z') || (a[i][0] == '_')))
			{
				System.out.print("no");
				System.out.print("\n");
				continue;
			}
			else
			{
				for (j = 1; a[i][j] != '\0'; j++)
				{
					if (!((a[i][j] >= 'a' && a[i][j] <= 'z') || (a[i][j] >= 'A' && a[i][j] <= 'Z') || (a[i][j] >= '0' && a[i][j] <= '9') || (a[i][j] == '_')))
					{
						System.out.print("no");
						System.out.print("\n");
						break;
					}
					if (a[i][j + 1] == '\0')
					{
						System.out.print("yes");
						System.out.print("\n");
					}
				}

			}
		}
		return 0;
	}
}

