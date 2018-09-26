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
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] a = new char[n][81];
		a[0] = new Scanner(System.in).nextLine();
		for (i = 0;i < n;i++)
		{
			a[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n;i++)
		{
			if ((a[i][0] == '_') || (a[i][0] >= 'a' && a[i][0] <= 'z') || (a[i][0] >= 'A' && a[i][0] <= 'Z'))
			{
				k = String.valueOf(a[i]).length();
				for (j = 1;j < k;j++)
				{
					if ((a[i][j] == '_') || (a[i][j] >= 'a' && a[i][j] <= 'z') || (a[i][j] >= 'A' && a[i][j] <= 'Z') || (a[i][j] >= '0' && a[i][j] <= '9'))
					{
						m = 0;
					}
					else
					{
						System.out.print('0');
						System.out.print("\n");
						break;
					}
				}
				if (j == k)
				{
					System.out.print('1');
					System.out.print("\n");
				}
			}
			else
			{
				System.out.print('0');
				System.out.print("\n");
			}
		}
		return 0;
	}

}

