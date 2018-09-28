import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int i;
	public static int j;
	public static int Main()
	{
		int n;
		String a = new String(new char[81]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0;i < n;i++)
		{
			int l;
			int p = 0;
			int q = 0;
			a = new Scanner(System.in).nextLine();
			l = a.length();
			if (a.charAt(0) == '_' || (a.charAt(0) >= 'A' && a.charAt(0) <= 'Z') || (a.charAt(0) <= 122 && a.charAt(0) >= 97))
			{
				p = 1;
			}
			else
			{
				p = 0;
			}
			q = 1;
			for (j = 1;j < l;j++)
			{
				if (a.charAt(j) == '_' || (a.charAt(j) >= 'A' && a.charAt(j) <= 'Z') || (a.charAt(j) <= 122 && a.charAt(j) >= 97) || (a.charAt(j) >= '0' && a.charAt(j) <= '9'))
				{
					continue;
				}
				else
				{
					q = 0;
				}
			}
			if (p == 0)
			{
				System.out.print("0");
				System.out.print("\n");
			}
			if (p == 1 && q == 1)
			{
				System.out.print("1");
				System.out.print("\n");
			}
			if (p == 1 && q == 0)
			{
				System.out.print("0");
				System.out.print("\n");
			}
		}
		return 0;
	}

}

