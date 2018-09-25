import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[120]);
		String s0 = new String(new char[120]);
		String a = new String(new char[20]);
		String b = new String(new char[20]);
		int k = 1;
		int ls;
		s = new Scanner(System.in).nextLine();
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (int i = 0;i < s.length() - a.length() + 1;i++)
		{
			ls = s.length();
			if (s.charAt(i) == a.charAt(0) && (s.charAt(i + a.length()) == 32 || s.charAt(a.length() + i) == '\0') && (i == 0 || s.charAt(i - 1) == 32))
			{
			for (int j = 1;j < a.length();j++)
			{
				if (s.charAt(i + j) != a.charAt(j))
				{
					k = 0;
					continue;
				}
			}
			}
			else
			{
				k = 0;
			}
			if (k == 1)
			{
				for (int g = 0;g < i;g++)
				{
					s0 = tangible.StringFunctions.changeCharacter(s0, g, s.charAt(g));
				}
				for (int n = i + a.length();n < s.length();n++)
				{
					s0 = tangible.StringFunctions.changeCharacter(s0, n - a.length() + b.length(), s.charAt(n));
				}
				for (int m = 0;m < b.length();m++)
				{
					s0 = tangible.StringFunctions.changeCharacter(s0, i + m, b.charAt(m));
				}
				for (int c = 0;c < ls - a.length() + b.length();c++)
				{
					s = tangible.StringFunctions.changeCharacter(s, c, s0.charAt(c));
				}
				s = tangible.StringFunctions.changeCharacter(s, ls - a.length() + b.length(), '\0');
				i += b.length() - 1;
			}
			k = 1;
		}
		System.out.print(s);
		System.out.print("\n");
		return 0;
	}
}

