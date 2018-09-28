import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int p;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] a = new char[1000][100];
		for (i = 1;i <= n + 1;i++)
		{
			a[i] = new Scanner(System.in).nextLine();
			if (i == 1)
			{
				continue;
			}
			else
			{
				p = 1;
			k = String.valueOf(a[i]).length();
			if (((a[i][0] >= 'a' && a[i][0] <= 'z') || (a[i][0] >= 'A' && a[i][0] <= 'Z') || (a[i][0] == '_')) == 0)
			{

				p = 0;
			}

			else
			{
				for (j = 1;j < k;j++)
				{
				if (((a[i][j] >= 'a' && a[i][j] <= 'z') || (a[i][j] >= 'A' && a[i][j] <= 'Z') || (a[i][j] == '_') || (a[i][j] >= '0' && a[i][j] <= '9')) == 0)
				{

				p = 0;
				}
				}


			}
			}
			if (p == 1)
			{
				System.out.print('1');
				System.out.print("\n");
			}
			else if (p == 0)
			{
				System.out.print('0');
				System.out.print("\n");
			}
		}
		return 0;


	}
}

