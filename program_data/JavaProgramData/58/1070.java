import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int l;
		int j;
		int t = 1;
		String a = new String(new char[81]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		while (a = new Scanner(System.in).nextLine())
		{
			l = a.length();
			if (!((a.charAt(0) == '_') || (a.charAt(0) <= 'z' && a.charAt(0) >= 'a') || (a.charAt(0) <= 'Z' && a.charAt(0) >= 'A')))
			{
				t = 0;
				System.out.print("0");
				System.out.print("\n");
				continue;
			}
			if ((a.charAt(0) == '_') || (a.charAt(0) <= 'z' && a.charAt(0) >= 'a') || (a.charAt(0) <= 'Z' && a.charAt(0) >= 'A'))
			{
				t = 1;
				for (j = 0;j < l;j++)
				{
					if (!((a.charAt(j) == '_') || (a.charAt(j) <= 'z' && a.charAt(j) >= 'a') || (a.charAt(j) <= 'Z' && a.charAt(j) >= 'A') || (a.charAt(j) <= '9' && a.charAt(j) >= '0')))
					{
						t = 0;
						break;
					}
				}
				if (t == 0)
				{
					System.out.print("0");
					System.out.print("\n");
				}
				if (t == 1)
				{
					System.out.print("1");
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

