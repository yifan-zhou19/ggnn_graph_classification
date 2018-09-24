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
		System.in.read();
		char[][] a = new char[200][200];
		for (i = 1;i <= n;i++)
		{
			a[i] = new Scanner(System.in).nextLine();
		}
		for (i = 1;i <= n;i++)
		{
			if ((a[i][0] != '_') && ((a[i][0] < 'A') || ((a[i][0]>'Z') && (a[i][0] < 'a')) || (a[i][0]>'z')))
			{
				System.out.print(0);
				System.out.print("\n");
			}
			else
			{
				for (j = 0;a[i][j] != '\0';j++)
				{
					if ((a[i][j] == '_') || ((a[i][j] <= 'Z') && (a[i][j] >= 'A')) || ((a[i][j] >= 'a') && (a[i][j] <= 'z')) || ((a[i][j] >= '0') && (a[i][j] <= '9')))
					{
						continue;
					}
					else
					{
						System.out.print(0);
						System.out.print("\n");
						break;
					}
				}
			if (a[i][j] == '\0')
			{
				System.out.print(1);
				System.out.print("\n");
			}
			}
		}


		return 0;
	}
}

