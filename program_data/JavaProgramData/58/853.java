import java.util.*;

package <missing>;

public class GlobalMembers
{
	//?????C????????
	public static int Main()
	{
		char[][] a = new char[101][100];
		int[] l = new int[101];
		int n; //n????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[0] = new Scanner(System.in).nextLine();
		for (int i = 1;i <= n;i++)
		{
			a[i] = new Scanner(System.in).nextLine();
			l[i] = String.valueOf(a[i]).length();
		}
		for (int i = 1;i <= n;i++)
		{
			if ((a[i][0] == '_') || ((a[i][0] >= 'a') && (a[i][0] <= 'z')) || ((a[i][0] >= 'A') && (a[i][0] <= 'Z')))
			{
				for (int j = 0;j < l[i];j++)
				{
					if ((a[i][j] == '_') || ((a[i][j] >= 'a') && (a[i][j] <= 'z')) || ((a[i][j] >= 'A') && (a[i][j] <= 'Z')) || ((a[i][j] >= '0') && (a[i][j] <= '9')))
					{
						if (j == l[i] - 1)
						{
							System.out.print(1);
							System.out.print("\n");
						}
						continue;
					}
					else
					{
						System.out.print(0);
						System.out.print("\n");
						break;
					}

				}
			}
			else
			{
				System.out.print(0);
				System.out.print("\n");
			}
		}

		return 0;
	}

}

