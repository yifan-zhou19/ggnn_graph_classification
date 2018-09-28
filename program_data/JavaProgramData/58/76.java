import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] string = new char[200][100];
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		int i;
		for (i = 0;i < n;i++)
		{
			String[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n;i++)
		{
			int k = 1;
			for (int j = 0;j < String.valueOf(String[i]).length();j++)
			{
				if (j == 0)
				{
					if ((String[i][j] == '_') || (String[i][j] >= 'A' && string[i][j] <= 'Z') || (String[i][j] >= 'a' && string[i][j] <= 'z'))
					{
						;
					}
					else
					{
						k = 0;
					}
				}
				else
				{
					if (String[i][j] == '_' || (String[i][j] >= 'A' && string[i][j] <= 'Z') || (String[i][j] >= 'a' && string[i][j] <= 'z') || (String[i][j] >= '0' && string[i][j] <= '9'))
					{
						;
					}
					else
					{
						k = 0;
					}
				}
			}
			if (k == 0)
			{
				System.out.print(0);
				System.out.print("\n");
			}
			else
			{
				System.out.print(1);
				System.out.print("\n");
			}
		}
		int a;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}
}

