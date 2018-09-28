import java.util.*;

package <missing>;

public class GlobalMembers
{
	// ?????C????????.cpp : Defines the entry point for the console application.
	// ??????????C????????
	public static int Main()
	{
		char[][] a =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		}; //?????????????????????????0
		int n; //????n????????????i?j?????0
		int i = 0;
		int j = 0;
		int num = 0; //????num???????????????????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read(); //??????????????
		for (i = 0;i < n;i++) //?for?????????
		{
			a[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n - 1;i++)
		{
			num = 0;
			for (j = 0;j < String.valueOf(a[i]).length();j++)
			{
				if ((a[i][j] >= 'A' && a[i][j] <= 'Z') || (a[i][j] >= 'a' && a[i][j] <= 'z') || a[i][j] == '_' || (a[i][j] >= '0' && a[i][j] <= '9')) //?????????????num????
				{
					num++;
				}
				else
				{
					System.out.print("0");
					System.out.print("\n");
					break;
				}
				if (num == String.valueOf(a[i]).length()) //???????????????
				{
					if ((a[i][0] >= 'A' && a[i][0] <= 'Z') || (a[i][0] >= 'a' && a[i][0] <= 'z') || a[i][0] == '_') //?????????????????1
					{
						System.out.print("1");
						System.out.print("\n");
					}
					else //????0??????
					{
						System.out.print("0");
						System.out.print("\n");
						break;
					}
				}
			}
		}
		num = 0;
		for (j = 0;j < String.valueOf(a[n - 1]).length();j++) //????????????C????????
		{
			if ((a[n - 1][j] >= 'A' && a[n - 1][j] <= 'Z') || (a[n - 1][j] >= 'a' && a[n - 1][j] <= 'z') || a[n - 1][j] == '_' || (a[n - 1][j] >= '0' && a[n - 1][j] <= '9'))
			{
				num++;
			}
			else
			{
				System.out.print("0");
				break;
			}
			if (num == String.valueOf(a[n - 1]).length())
			{
				if ((a[n - 1][0] >= 'A' && a[n - 1][0] <= 'Z') || (a[n - 1][0] >= 'a' && a[n - 1][0] <= 'z') || a[n - 1][0] == '_')
				{
						System.out.print("1");
						System.out.print("\n");
				}
					else
					{
						System.out.print("0");
						System.out.print("\n");
						break;
					}
			}
		}
			return 0;
	}

}

