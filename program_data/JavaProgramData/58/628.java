import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String a = new String(new char[81]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < n;i++)
		{
			a = new Scanner(System.in).nextLine();
			if (((a.charAt(0) != '_') + (a.charAt(0) > 'Z' || (a.charAt(0) < 'A')) + (a.charAt(0)>'z' || a.charAt(0) < 'a')) == 3)
			{
				System.out.print('0');
				System.out.print("\n");
			}
			else
			{
				for (j = 0;j < a.length();j++)
				{
					if (((a.charAt(j) != '_') + (a.charAt(j) > '9' || a.charAt(j) < '0') + (a.charAt(j)>'Z' || (a.charAt(j) < 'A')) + (a.charAt(j)>'z' || a.charAt(j) < 'a')) == 4)
					{
					System.out.print('0');
					System.out.print("\n");
					break;
					}
				}
				if (j == a.length())
				{
					System.out.print('1');
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

