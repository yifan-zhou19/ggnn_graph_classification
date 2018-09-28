import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		String s1 = new String(new char[101]);
		s = new Scanner(System.in).nextLine();
		String p = null;
		p = s;
		int i = 1;
		while (i < s.length())
		{
			s1 = tangible.StringFunctions.changeCharacter(s1, i - 1, *(p.Substring(i) - 1) + *(p.Substring(i)));
			i++;
		}
		i--;
		s1 = tangible.StringFunctions.changeCharacter(s1, i, s.charAt(0) + *(p.Substring(i)));
		for (i = 0;i < s.length();i++)
		{
			System.out.print((char)s1.charAt(i));
		}
		return 0;
	}
}

