import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] str = new char[200][81];
		int i;
		int j;
		int k;
		int n;
		int count;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (k = 0; k < n; k++)
		{
			str[k] = new Scanner(System.in).nextLine();
		}
		for (i = 0; i < n; i++)
		{
			count = 0;
			for (j = 0; str[i][j] != 0; j++)
			{
				if (str[i][0] != '_' && (str[i][0] < 'A' || str[i][0] > 'z'))
				{
					count++;
					break;
				}
				if (str[i][j] != '_' && (str[i][j] < 'A' || str[i][j] > 'z') && (str[i][j] < '0' || str[i][j] > '9'))
				{
					count++;
				}
			}
			if (count == 0)
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
		return 0;
	}
}

