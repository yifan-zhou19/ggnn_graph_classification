import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] str = new char[2][100];
		int i;
		int n = 0;
		str[0] = new Scanner(System.in).nextLine();
		str[1] = new Scanner(System.in).nextLine();
		for (i = 0;str[0][i] != '\0' && str[1][i] != '\0';i++)
		{
			if (str[0][i] > 96)
			{
			   str[0][i] = str[0][i] - 32;
			}
			if (str[1][i] > 96)
			{
			   str[1][i] = str[1][i] - 32;
			}
			if (str[0][i] == str[1][i])
			{
				continue;
			}
			else if (str[0][i] > str[1][i])
			{
				n++;
				System.out.print(">");
				System.out.print("\n");
				break;
			}
			else
			{
				n++;
				System.out.print("<");
				System.out.print("\n");
				break;
			}
		}
		if (n == 0)
		{
			System.out.print("=");
		}
		return 0;
	}
}
