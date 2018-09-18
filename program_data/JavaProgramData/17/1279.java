package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[110]);
	while (gets(a) != null)
	{
	System.out.println(a);
	for (int i = 0;i < a.length();i++)
	{
		if (a.charAt(i) == '(')
		{
			a = tangible.StringFunctions.changeCharacter(a, i, '$');
		}
		else if (a.charAt(i) == ')')
		{
				a = tangible.StringFunctions.changeCharacter(a, i, '?');
				for (int j = i - 1;j >= 0;j--)
				{
					if (a.charAt(j) == '$')
					{
					   a = tangible.StringFunctions.changeCharacter(a, j, ' ');
					   a = tangible.StringFunctions.changeCharacter(a, i, ' ');
					   break;
					}
				}
		}
			 else
			 {
				 a = tangible.StringFunctions.changeCharacter(a, i, ' ');
			 }
	}
	System.out.println(a);
	}
	}

}

