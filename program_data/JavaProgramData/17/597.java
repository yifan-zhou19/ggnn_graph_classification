package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		int i;
		int j;
		int len;
		while ((a = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			System.out.print(a);
			System.out.print("\n");
			len = a.length();
			for (i = 1; i < len; i++)
			{
				for (j = 0; j < len - i; j++)
				{
					if (a.charAt(j) == '(' && a.charAt(j + i) == ')')
					{
						a = tangible.StringFunctions.changeCharacter(a, j, ' ');
						a = tangible.StringFunctions.changeCharacter(a, j + i, ' ');
					}
					if (a.charAt(j) != '(' && a.charAt(j) != ')')
					{
						a = tangible.StringFunctions.changeCharacter(a, j, ' ');
					}
				}
			}
			for (i = 0; i < len; i++)
			{
				if (a.charAt(i) == '(')
				{
					a = tangible.StringFunctions.changeCharacter(a, i, '$');
				}
				if (a.charAt(i) == ')')
				{
					a = tangible.StringFunctions.changeCharacter(a, i, '?');
				}
			}
			System.out.print(a);
			System.out.print("\n");
		}
		return 0;
	}
}

