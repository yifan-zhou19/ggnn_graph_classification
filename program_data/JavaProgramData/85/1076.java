package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int flag;
		char[][] str = new char[100][20];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			flag = 0;
			str[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if ((char)65 <= str[i][0] && str[i][0] <= (char)90 || (char)97 <= str[i][0] && str[i][0] <= (char)122 || str[i][0] == (char)95)
			{
				for (j = 1; j < String.valueOf(str[i]).length(); j++)
				{
					if ((char)65 <= str[i][j] && str[i][j] <= (char)90 || (char)97 <= str[i][j] && str[i][j] <= (char)122 || (char)48 <= str[i][j] && str[i][j] <= (char)57 || str[i][j] == (char)95)
					{
						continue;
					}
					else
					{
						System.out.print("no");
						System.out.print("\n");
						flag = 1;
						break;
					}
				}
				if (flag == 0)
				{
					System.out.print("yes");
					System.out.print("\n");
				}
			}
			else
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		return 0;
	}

}

