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
		char[][] str = new char[100][81];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0; i < n; i++)
		{
			str[i] = new Scanner(System.in).nextLine();
			len = String.valueOf(str[i]).length();
			if ((str[i][0] == '_') || ((str[i][0] >= 'a') && (str[i][0] <= 'z')) || ((str[i][0] >= 'A') && (str[i][0] <= 'Z')))
			{
				for (j = 1; j < len; j++)
				{
					if ((str[i][j] == '_') || ((str[i][j] >= 'a') && (str[i][j] <= 'z')) || ((str[i][j] >= 'A') && (str[i][j] <= 'Z')) || ((str[i][j] >= '0') && (str[i][j] <= '9')))
					{
						continue;
					}
					else
					{
						break;
					}
				}
				if (j == len)
				{
					System.out.print("1");
					System.out.print("\n");
				}
				else
				{
					System.out.print("0");
					System.out.print("\n");
				}
			}
				else
				{
					System.out.print("0");
					System.out.print("\n");
				}
		}
		return 0;
	}

}

