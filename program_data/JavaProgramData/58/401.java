import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[81]);
		int i;
		int j;
		int l;
		int n;
		int g;
		g = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (j = 0;j < g;j++)
		{
			a = new Scanner(System.in).nextLine();
			for (n = 0;a.charAt(n) != 0;n++)
			{
				;
			}
			l = 0;
			if (a.charAt(0) == '_' || (a.charAt(0) - 'a' < 26 && a.charAt(0) - 'a' >= 0) || (a.charAt(0) - 'A' >= 0 && a.charAt(0) - 'A' < 26))
			{
				l = 1;
				for (i = 1;i < n;i++)
				{
					if (a.charAt(i) == '_' || (a.charAt(i) - 'a' < 26 && a.charAt(i) - 'a' >= 0) || (a.charAt(i) - '0' >= 0 && a.charAt(i) - '0' < 10) || (a.charAt(i) - 'A' >= 0 && a.charAt(i) - 'A' < 26))
					{
						l = 1;
					}
					else
					{
						l = 0;
						break;
					}
				}
			}
			System.out.print(l);
			System.out.print("\n");
		}
		return 0;
	}
}

