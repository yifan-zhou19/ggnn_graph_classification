import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] str =
		{
			{' ', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int n;
		int i;
		int j;
		int flag1 = 0;
		int flag2 = 0;
		int[] len = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0;i < n;i++)
		{
			str[i] = new Scanner(System.in).nextLine();
			len[i] = String.valueOf(str[i]).length();
		}
		for (i = 0;i < n;i++)
		{
			flag1 = 0;
			flag2 = 0;
			if ((str[i][0] == '_') || ('a' <= str[i][0] && str[i][0] <= 'z' || 'A' <= str[i][0] && str[i][0] <= 'Z'))
			{
				flag1 = 1;
			}
			for (j = 0;j < len[i];j++)
			{
				flag2 = 0;
				if ((str[i][j] == '_') || (str[i][j] >= '0' && str[i][j] <= '9') || (('a' <= str[i][j] && str[i][j] <= 'z') || ('A' <= str[i][j] && str[i][j] <= 'Z')))
				{
				flag2 = 1;
				}
				if (flag2 == 0)
				{
					break;
				}

			}
			if (flag1 + flag2 == 2)
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

	   return 0;
	}






}

