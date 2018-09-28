import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[81]);
		String b = new String(new char[81]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		int i;
		int n;
		int m;
		n = a.length();
		m = b.length();
		for (i = 0;i < n && i < m;i++)
		{
			if (a.charAt(i) <= 'z' && a.charAt(i) >= 'a')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - ('a'-'A'));
			}
			if (b.charAt(i) <= 'z' && b.charAt(i) >= 'a')
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - ('a'-'A'));
			}
		}
		if (strcmp(a,b) > 0)
		{
			System.out.print(">");
			System.out.print("\n");
		}
		if (strcmp(a,b) < 0)
		{
			System.out.print("<");
			System.out.print("\n");
		}
		if (strcmp(a,b) == 0)
		{
			System.out.print("=");
			System.out.print("\n");
		}
		return 0;
	}
}

