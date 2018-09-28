import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String str = new String(new char[90]);
	public static int Main()
	{
		int n;
		int i;
		int j;
		int len;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		cin.ignore();
		for (i = 0 ; i < n ; i++)
		{
			str = new Scanner(System.in).nextLine();
			len = str.length();
			for (j = 0 ; j < len ; j++)
			{
				if (!((str.charAt(0) == '_') || ((str.charAt(0) - 'a' >= 0) && (str.charAt(0) - 'a' < 26)) || ((str.charAt(0) - 'A' >= 0) && (str.charAt(0) - 'A' < 26))))
				{
					break;
				}
				if (!(((str.charAt(j) >= '0') && (str.charAt(j) <= '9')) || ((str.charAt(j) - 'a' >= 0) && (str.charAt(j) - 'a' < 26)) || ((str.charAt(j) - 'A' >= 0) && (str.charAt(j) - 'A' < 26)) || (str.charAt(j) == '_')))
				{
					break;
				}
			}
			if (j == len)
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
		return 0;
	}
}

