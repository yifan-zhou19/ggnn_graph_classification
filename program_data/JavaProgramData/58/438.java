import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		char[][] a = new char[200][81];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= n;i++)
		{
			a[i] = new Scanner(System.in).nextLine();
		}
		for (i = 1;i <= n;i++)
		{
			if (a[i][0] == '_' || ((int)a[i][0] >= 65 && (int)a[i][0] <= 122))
			{
				j = 1;
				while (a[i][j] != '\0')
				{
					if (((int)a[i][j] >= 65 && (int)a[i][j] <= 122) || ((int)a[i][j] >= 48 && (int)a[i][j] <= 57) || a[i][j] == '_')
					{
						j++;
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
			else
			{
				System.out.print(0);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

