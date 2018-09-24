import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		char[][] a =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int[] b = new int[10000];
		int i = 0;
		int j = 0;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 1; i <= n; i++)
		{
			a[i] = new Scanner(System.in).nextLine();
		}

		for (i = 1; i <= n; i++)
		{
			if ((a[i][0] == '_') || ((a[i][0] >= 'a') && (a[i][0] <= 'z')) || ((a[i][0] >= 'A') && (a[i][0] <= 'Z')))
			{
				b[i] = 1;
				for (j = 1; j <= 82; j++)
				{
					if (a[i][j] == '\0')
					{
						break;
					}
					if ((a[i][j] == '_') || ((a[i][j] >= 'a') && (a[i][j] <= 'z')) || ((a[i][j] >= 'A') && (a[i][j] <= 'Z')) || ((a[i][j] >= '0') && (a[i][j] <= '9')))
					{
						b[i] = 1;
					}
					else
					{
						b[i] = 0;
						break;
					}
				}
			}
			else
			{
				b[i] = 0;
			}
		}

		for (i = 1; i <= n; i++)
		{
			System.out.print(b[i]);
			System.out.print("\n");
		}

		return 0;
	}
}

