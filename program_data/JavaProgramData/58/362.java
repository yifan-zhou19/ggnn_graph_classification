import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (int i = 1; i <= n; i++)
		{
			String str = new String(new char[85]);
			int l;
			int t;
			str = new Scanner(System.in).nextLine();
			l = str.length();
			if ((str.charAt(0) == '_') || (str.charAt(0) >= 'a' && str.charAt(0) <= 'z') || (str.charAt(0) >= 'A' && str.charAt(0) <= 'Z'))
			{
				for (t = 1; str.charAt(t) != '\0'; t++)
				{
					if (!((str.charAt(t) == '_') || (str.charAt(t) >= 'a' && str.charAt(t) <= 'z') || (str.charAt(t) >= 'A' && str.charAt(t) <= 'Z') || (str.charAt(t) >= '0' && str.charAt(t) <= '9')))
					{
						System.out.print("0");
						System.out.print("\n");
						break;
					}
				}
				if (t == l)
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
		return 0;
	}
}

