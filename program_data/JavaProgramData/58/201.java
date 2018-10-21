import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] str = new char[100][81];
		int i;
		int j;
		int[] flag = new int[100];
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0;i < n;i++)
		{
			str[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;str[i][j] != '\0';j++)
			{
				// ?????
				if (j == 0)
				{
					if (str[i][0] == '_' || str[i][0] >= 'a' && str[i][0] <= 'z' || str[i][0] >= 'A' && str[i][0] <= 'Z')
					{
						flag[i] = 1;
					}
					else
					{
						flag[i] = 0;
					}
				}
				// ??????_ AZ az 09
				if (flag[i] == 1)
				{
					if (str[i][j] == '_' || str[i][j] >= 'a' && str[i][j] <= 'z' || str[i][j] >= 'A' && str[i][j] <= 'Z' || str[i][j] >= '0' && str[i][j] <= '9')
					{
						flag[i] = 1;
					}
					else
					{
						flag[i] = 0;
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.print(flag[i]);
			System.out.print("\n");
		}
		return 0;
	}

}

