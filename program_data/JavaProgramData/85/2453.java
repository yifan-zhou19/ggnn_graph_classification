import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		int i;
		int len;
		int n;
		int hash = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		while (n-- != 0)
		{
			hash = 1;
			str = new Scanner(System.in).nextLine();
			len = str.length();
			if ((str.charAt(0) >= 'a' && str.charAt(0) <= 'z') || (str.charAt(0) >= 'A' && str.charAt(0) <= 'Z') || str.charAt(0) == '_')
			{
				hash = 1;
				for (i = 1; i < len; i++)
				{
					if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'))
					{
						hash = 1;
					}
					else if ((str.charAt(i) >= '0' && str.charAt(i) <= '9') || str.charAt(i) == '_' || str.charAt(i) == '(' || str.charAt(i) == ')')
					{
						hash = 1;
					}
					else
					{
						hash = 0;
						break;
					}
				}
			}
			else
			{
				hash = 0;
			}
			if (hash == 1)
			{
				System.out.print("yes");
				System.out.print("\n");
			}
			else
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}

		return 0;

	}
}

