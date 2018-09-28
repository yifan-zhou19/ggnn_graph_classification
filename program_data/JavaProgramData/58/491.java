import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int len;
		char[][] str = new char[10000][81];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0; i < n; i++)
		{
			str[i] = new Scanner(System.in).nextLine();
			len = String.valueOf(str[i]).length();
			if (str[i][0] == '_')
			{
				for (j = 1; j < len; j++)
				{
					if ((str[i][j] - 'a' >= 0 && str[i][j] - 'a' <= 25) || (str[i][j] - 'A' >= 0 && str[i][j] - 'A' <= 25) || (str[i][j] - '0' >= 0 && str[i][j] - '0' <= 9) || str[i][j] == '_')
					{
					}
					else
					{
						System.out.print(0);
						System.out.print("\n");
						break;
					}
				}
				if (j == len)
				{
					System.out.print(1);
					System.out.print("\n");
				}
			}
			if (str[i][0] != '_')
			{
				if ((str[i][0] - 'a' >= 0 && str[i][0] - 'a' <= 25) || (str[i][0] - 'A' >= 0 && str[i][0] - 'A' <= 25))
				{
					for (j = 1; j < len; j++)
					{
						if ((str[i][j] - 'a' >= 0 && str[i][j] - 'a' <= 25) || (str[i][j] - 'A' >= 0 && str[i][j] - 'A' <= 25) || (str[i][j] - '0' >= 0 && str[i][j] - '0' <= 9) || str[i][j] == '_')
						{
						}
						else
						{
							System.out.print(0);
							System.out.print("\n");
							break;
						}
					}
					if (j == len)
					{
						System.out.print(1);
						System.out.print("\n");
					}
				}
				else
				{
					System.out.print(0);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

