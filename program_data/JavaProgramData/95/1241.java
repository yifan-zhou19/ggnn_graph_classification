import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;i < a.length();i++)
		{
			if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
			{
				a.charAt(i) -= 'A'-'a';
			}
			if (b.charAt(i) >= 'A' && b.charAt(i) <= 'Z')
			{
				b.charAt(i) -= 'A'-'a';
			}
			if (a.charAt(i) > b.charAt(i))
			{
				System.out.print(">");
				return 0;
			}
			else if (a.charAt(i) < b.charAt(i))
			{
				System.out.print("<");
				return 0;
			}
		}
		System.out.print("=");
		return 0;
	}
}
