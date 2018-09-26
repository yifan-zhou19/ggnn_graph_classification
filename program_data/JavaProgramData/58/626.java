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
		int[] b = new int[n];
		char[][] a = new char[n][100];
		for (i = 0;i <= n;i++)
		{
			a[i] = new Scanner(System.in).nextLine();
			b[i] = String.valueOf(a[i]).length();
		}

		for (i = 1;i <= n;i++)
		{
			if (((a[i][0] == '_') || ((a[i][0] >= 'a') && (a[i][0] <= 'z')) || ((a[i][0] >= 'A') && (a[i][0] <= 'Z'))) == 1)
			{
				for (j = 0;j < String.valueOf(a[i]).length();j++)
				{
					if (((a[i][j] == '_') || ((a[i][j] >= 'a') && (a[i][j] <= 'z')) || ((a[i][j] >= 'A') && (a[i][j] <= 'Z')) || ((a[i][j] >= '0') && a[i][j] <= '9')) == 0)
					{
					System.out.print("0");
					System.out.print("\n");
					break;
					}
				}
				if ((j == String.valueOf(a[i]).length()) == 1)
				{
				System.out.print("1");
				System.out.print("\n");
				}
			}
					else
					{
				System.out.print("0");
				System.out.print("\n");
					}
		}
		return 0; //??
	}




}

