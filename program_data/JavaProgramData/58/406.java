import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] str = new char[100][81];
		System.in.read();
		for (i = 0;i < n;i++)
		{
			str[i] = new Scanner(System.in).nextLine();
			if (str[i][0] != '_' && ((str[i][0] - 'a' < 0) || (str[i][0] - 'z'>0)) && ((str[i][0] - 'Z' > 0) || (str[i][0] - 'A' < 0)))
			{
				System.out.print(0);
				System.out.print("\n");
				continue;
			}
			for (j = 1;str[i][j] != '\0';j++)
			{
				if ((str[i][j] != '_') && ((str[i][j] - 'z' > 0) || (str[i][j] - 'a' < 0)) && ((str[i][j] - 'Z'>0) || (str[i][j] - 'A' < 0)) && (str[i][j] != '0' && str[i][j] != '1' && str[i][j] != '2' && str[i][j] != '3' && str[i][j] != '4' && str[i][j] != '5' && str[i][j] != '6' && str[i][j] != '7' && str[i][j] != '8' && str[i][j] != '9'))
				{
					System.out.print(0);
					System.out.print("\n");
					break;
				}
			}
			if (str[i][j] == '\0')
			{
			   System.out.print(1);
			   System.out.print("\n");
			}
		}


		return 0;
	}
}

