package <missing>;

public class GlobalMembers
{
	public static int get(char c)
	{
		if (c >= 'A' && c <= 'Z')
		{
			return c - 'A' + 10;
		}
		else
		{
			return c - '0';
		}
	}
	public static void Main()
	{
		String s1 = new String(new char[1000]);
		String s = new String(new char[1000]);
		char c = '0';
		int i;
		while (c != EOF)
		{
			c = System.in.read();
			if (c == EOF)
			{
				return;
			}
			s1 = new Scanner(System.in).nextLine();
			for (i = 0;i < s1.length();i++)
			{
				s = tangible.StringFunctions.changeCharacter(s, i, s1.charAt(s1.length() - 1 - i));
			}
			int l = 0;
			int r = s1.length();
			s = tangible.StringFunctions.changeCharacter(s, r, c);
			if (s.charAt(s1.length()) == '-')
			{
				r--;
				System.out.print("-");
			}
			while (s.charAt(l) == '0' && r - l > 0)
			{
				l++;
			}
			for (i = l;i <= r;i++)
			{
				System.out.printf("%c",s.charAt(i));
			}
			System.out.print("\n");
		}
	}
}

