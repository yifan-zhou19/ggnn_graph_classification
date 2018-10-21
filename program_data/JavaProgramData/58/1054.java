import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[200][200];
		int i;
		int j;
		int n;
		int flag;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= n;i++)
		{
			a[i] = new Scanner(System.in).nextLine();
		}
		for (i = 1;i <= n;i++)
		{
			flag = 1;
			if (a[i][0] == '_' || a[i][0] <= 'Z' && a[i][0] >= 'A' || a[i][0] <= 'z' && a[i][0] >= 'a')
			{
				for (j = 0;a[i][j] != '\0';j++)
				{
					if (a[i][j] != '_' && (a[i][j] > 'Z' || a[i][j] < 'A') && (a[i][j]>'z' || a[i][j] < 'a') && (a[i][j]>'9' || a[i][j] < '0'))
					{
						flag = 0;
						break;
					}
				}
			}
			else
			{
				flag = 0;
			}
			System.out.print(flag);
			System.out.print("\n");
		}
		return 0;
	}

}

