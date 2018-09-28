import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main() //?????
	{ //?????
		int n; //????
		int i; //????
		int j;
		char[][] a =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		}; //????a
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0;i < n;i++) //a?????
		{
			a[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n;i++) //????
		{
			if (a[i][0] == '_' || (a[i][0] >= 'a' && a[i][0] <= 'z') || (a[i][0] >= 'A' && a[i][0] <= 'Z'))
			{
				for (j = 0;j < 100;j++)
				{
					if (a[i][j] == '_' || (a[i][j] >= 'a' && a[i][j] <= 'z') || (a[i][j] >= 'A' && a[i][j] <= 'Z') || (a[i][j] >= '0' && a[i][j] <= '9'))
					{
						continue;
					}
					else if (a[i][j] == '\0')
					{
						System.out.print("1");
						System.out.print("\n");
						break;
					}
					else
					{
						System.out.print("0");
						System.out.print("\n");
						break;
					}
				}
			}
			else
			{
				System.out.print("0");
				System.out.print("\n");
				continue;
			}
		}
		return 0; //?????
	}


}

