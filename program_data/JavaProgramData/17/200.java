package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[101]);
	int len;
	while ((a = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
	{
		System.out.print(a);
		System.out.print("\n");
		System.out.print("\n");
		len = a.length();
		for (int i = 0; i < len ; i++)
		{
			if (Character.isLetter(a.charAt(i)))
			{
				a = tangible.StringFunctions.changeCharacter(a, i, ' ');
			}
			else if (a.charAt(i) == '(')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, '$');
			}
			else if (a.charAt(i) == ')')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, '?');
			}
		}
		for (int temp = 0; temp < len / 2 ; temp++)
		{
			for (int i = 0; i < len ; i++)
			{
				if (a.charAt(i) == '$')
				{
					for (int j = i + 1; j < len ; j++)
					{
						if (a.charAt(j) == '$')
						{
							break;
						}
						else if (a.charAt(j) == '?')
						{
							a = tangible.StringFunctions.changeCharacter(a, i, ' ');
							a = tangible.StringFunctions.changeCharacter(a, j, ' ');
							break;
						}
					}
				}
			}
		}
		System.out.print(a);
		System.out.print("\n");
		System.out.print("\n");
	}
	System.in.read();
	System.in.read();
	return 0;
	}


}

