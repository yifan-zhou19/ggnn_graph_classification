import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		while (n-- != 0)
		{
			String a = new String(new char[30]);
			a = new Scanner(System.in).nextLine();
			int str;
			str = a.length();

			for (int i = 0;i < str;i++)
			{
				if ((a.charAt(i) >= '0' && a.charAt(i) <= '9') || (a.charAt(i) >= 'a' && a.charAt(i) <= 'z') || (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') || a.charAt(i) == '_')
				{
					t = 1;
				}
				else
				{
					t = 0;
					break;
				}
			}
			if (a.charAt(0) >= '0' && a.charAt(0) <= '9')
			{
					t = 0;
			}
				if (t != 0)
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

