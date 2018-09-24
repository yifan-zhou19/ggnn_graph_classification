package <missing>;

public class GlobalMembers
{
	public static String s = new String(new char[105]);
	public static int len;
	public static int f(int b)
	{
		for (int i = b + 1; i < len; i++)
		{
			if (s.charAt(i) == ')')
			{
				s = tangible.StringFunctions.changeCharacter(s, b, '$');
				s = tangible.StringFunctions.changeCharacter(s, i, '?');
				return i;
			}
			else if (s.charAt(i) == '(')
			{
				i = f(i);
			}
		}
		return len - 1;
	}
	public static int Main()
	{
		while ((s = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			len = s.length();
			System.out.print(s);
			System.out.print("\n");
			for (int i = 0; i < len; i++)
			{
				if (s.charAt(i) == '(')
				{
					i = f(i);
				}
			}
			for (int i = 0; i < len; i++)
			{
				if (s.charAt(i) == '(')
				{
					System.out.print('$');
				}
				else if (s.charAt(i) == ')')
				{
					System.out.print('?');
				}
				else
				{
					System.out.print(' ');
				}
			}
			System.out.print("\n");
		}
		return 0;
	}

}

