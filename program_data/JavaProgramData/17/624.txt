package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[1000]);
	public static int n;
	public static int c1 = 0;
	public static int match(int c)
	{
		for (int i = c; i < n; i++)
		{
			if (a.charAt(i) != '(' && a.charAt(i) != ')' && a.charAt(i) != '$')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, ' ');
			}
			if (a.charAt(i) == '(')
			{
				c1++;
				if (match(i + 1) != 0)
				{
					a = tangible.StringFunctions.changeCharacter(a, i, ' ');
					a = tangible.StringFunctions.changeCharacter(a, match(i + 1), ' ');
					c1--;
				}
				else
				{
					a = tangible.StringFunctions.changeCharacter(a, i, '$');
				}
			}
			if (a.charAt(i) == ')')
			{
				if (c1 == 0)
				{
					a = tangible.StringFunctions.changeCharacter(a, i, '?');
					if (i < n)
					{
						match(i + 1);
						return 0;
					}
				}
				return i;
			}
		}
		return 0;
	}
	public static int Main() //???
	{
		while ((a = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			c1 = 0;
			n = a.length();
			System.out.print(a);
			System.out.print("\n");
			match(0);
			System.out.print(a);
			System.out.print("\n");
			System.out.print("\n");
		}
		return 0;
	} //?????

}

