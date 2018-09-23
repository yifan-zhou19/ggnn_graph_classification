package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[105]);
	while ((gets(a)) != null)
	{
	System.out.printf("%s\n",a);
	for (int i = 0;a.charAt(i) != 0;i++)
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
	System.out.printf("%s\n",a);
	}
	}

}

