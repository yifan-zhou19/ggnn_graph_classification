import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[100000]);
	public static String b = new String(new char[100000]);

	public static int Main()
	{
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (int x = 0;x < Math.min(a.length(),b.length());x++)
		{
			if (a.charAt(x) <= 'z' && a.charAt(x) >= 'a')
			{
				a.charAt(x) -= 'a'-'A';

			}
			if (b.charAt(x) <= 'z' && b.charAt(x) >= 'a')
			{
				b.charAt(x) -= 'a'-'A';
			}
			if (a.charAt(x) > b.charAt(x))
			{
				System.out.print(">");
				return 0;
			}
			if (a.charAt(x) < b.charAt(x))
			{
				System.out.print("<");
				return 0;
			}
		}
		if (a.length() == b.length())
		{
			System.out.print("=");
			return 0;
		}
		if (a.length() > b.length())
		{
			System.out.print(">");
			return 0;
		}
		else
		{
			System.out.print("<");
			return 0;
		}
		return 0;

	}
}
