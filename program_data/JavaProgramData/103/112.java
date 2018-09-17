package <missing>;

public class GlobalMembers
{
	public static char l(char c)
	{
		 if (c >= 'a' && c <= 'z')
		 {
		 return c + 'A'-'a';
		 }
		 else
		 {
		 return c;
		 }
	}

	public static int Main()
	{
		String s = new String(new char[1001]);
		s = ConsoleInput.readToWhiteSpace(true).charAt(0);
		char c = l(s.charAt(0));
		int m = 1;
		for (int i = 1;i <= s.length();i++)
		{
		if (c == l(s.charAt(i)))
		{
		m++;
		}
		else
		{
			System.out.print('(');
			System.out.print(c);
			System.out.print(',');
			System.out.print(m);
			System.out.print(')');
		c = l(s.charAt(i));
		m = 1;
		}
		}
		System.out.print("\n");

	}
}

