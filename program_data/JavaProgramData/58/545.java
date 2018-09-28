import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		char[][] str = new char[100][100];

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();

		for (int i = 0; i < n; i++)
		{
			str[i] = new Scanner(System.in).nextLine();

			int f = 0;
			for (int j = 0; str[i][j] != 0; j++)
			{
				if (str[i][j] != '_' && ((str[i][j] > 'z') || (str[i][j] < 'A')))
				{
					if (j == 0 || str[i][j] < '0' || str[i][j] > '9')
					{
						System.out.print("0");
						System.out.print("\n");
						f = 1;
						break;
					}
				}
			}
			if (f == 0)
			{
				System.out.print("1");
				System.out.print("\n");
			}
		}

		return 0;
	}

}

