package <missing>;

public class GlobalMembers
{
	public static char change(char a)
	{
		if (a >= 'a' && a <= 'z')
		{
			a = a - 'a'+'A';
		}
		return a;
	}
	public static int Main()
	{
		int len1;
		int len2;
		int a;
		int b;
		int c = 0;
		String s1 = new String(new char[85]);
		String s2 = new String(new char[85]);
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		len1 = s1.length();
		len2 = s2.length();
		for (b = 0;b < len1;b++)
		{
			s1 = tangible.StringFunctions.changeCharacter(s1, b, change(s1.charAt(b)));
		}
		for (b = 0;b < len2;b++)
		{
			s2 = tangible.StringFunctions.changeCharacter(s2, b, change(s2.charAt(b)));
		}
		for (b = 0;b < len1 && b < len2;b++)
		{
			if (s1.charAt(b) > s2.charAt(b))
			{
				System.out.print(">");
				c = 1;
				break;
			}
			else if (s1.charAt(b) < s2.charAt(b))
			{
				System.out.print("<");
				c = 1;
				break;
			}
		}
		if (c == 0)
		{
			System.out.print("=");
		}
	}


}

