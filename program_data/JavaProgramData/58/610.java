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
		int[] a = new int[1000];
		int p;
		int q;
		char[][] str = new char[1000][90];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 1;i <= n;i++)
		{
			str[i] = new Scanner(System.in).nextLine();
		}
		for (j = 1;j <= n;j++)
		{
			a[j] = String.valueOf(str[j]).length();
		}
		for (k = 1;k <= n;k++)
		{
			if (str[k][0] == '_' || (str[k][0] >= 'A' && str[k][0] <= 'Z') || (str[k][0] >= 'a' && str[k][0] <= 'z'))
			{
				for (p = 0;p <= a[k] - 1;p++)
				{
					if (str[k][p] != '_' && (str[k][p] < 'A' || (str[k][p]>'Z' && str[k][p] < 'a') || str[k][p]>'z') && (str[k][p] < '0' || str[k][p]>'9'))
					{
						break;
					}
				}
				if (p == a[k])
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
			else
			{
				System.out.print("0");
				System.out.print("\n");
			}

		}
		return 0;
	}
}

