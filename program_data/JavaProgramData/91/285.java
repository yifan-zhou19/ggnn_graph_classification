import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		a = new Scanner(System.in).nextLine();
		String p;
		p = a;
		String b = new String(new char[101]);
		int n = a.length();
		int i = 0;
		for (i = 0;i < n;i++)
		{
			if (i != n - 1)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, p.charAt(i) + p.charAt(i + 1));
			}
			else
			{
				b = tangible.StringFunctions.changeCharacter(b, i, p.charAt(i) + p.charAt(0));
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.print((char)(b.charAt(i)));
		}
		return 0;
	}
}

