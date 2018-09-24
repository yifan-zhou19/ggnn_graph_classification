import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] len = new int[100];
		int[] sum = new int[100];
		char[][] str = new char[100][81];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0;i < n;i++)
		{
			str[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n;i++)
		{
			if ((str[i][0] == '_') || ('A' <= str[i][0] && str[i][0] <= 'Z') || ('a' <= str[i][0] && str[i][0] <= 'z'))
			{
				for (j = 1;j < 81;j++)
				{
					if (str[i][j] == '\0')
					{
						break;
					}
					len[i]++;
					if ((str[i][j] == '_') || ('a' <= str[i][j] && str[i][j] <= 'z') || ('A' <= str[i][j] && str[i][j] <= 'Z') || ('0' <= str[i][j] && str[i][j] <= '9'))
					{
						sum[i]++;
					}
				}
				if (len[i] == sum[i])
				{
					System.out.print(1);
					System.out.print("\n");
				}
				else
				{
					System.out.print(0);
					System.out.print("\n");
				}
			}
			else
			{
				System.out.print(0);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

