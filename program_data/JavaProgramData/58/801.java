import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int judge(char a)
	{
		int flag = 0;
		if (a == 95 || (a > 64 && a < 91) || (a>96 && a < 123))
		{
			flag = 1;
		}
		return flag;
	}

	public static int Main()
	{
		char[][] words =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int n = 0;
		int i = 0;
		int j = 0;
		int space = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0;i < n;i++)
		{
			words[i] = new Scanner(System.in).nextLine();
			for (j = 0;j < 100;j++)
			{
				if ((words[i][j] > 64 && words[i][j] < 91) || (words[i][j]>96 && words[i][j] < 123) || (words[i][j]>47 && words[i][j] < 58) || words[i][j] == 95)
				{
					continue;
				}
				else
				{
					if (words[i][j] != 0)
					{
					space = 1;
					System.out.print("0");
					System.out.print("\n");
					break;
					}
				}
			}
			if (space == 0)
			{
				System.out.print(judge(words[i][0]));
				System.out.print("\n");
			}
			space = 0;
		}
		return 0;
	}
}

