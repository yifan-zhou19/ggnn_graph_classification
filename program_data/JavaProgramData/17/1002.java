package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	String a = new String(new char[101]);
	while (scanf("%s",a) != EOF)
	{
	for (i = 0;i < a.length();i++)
	{
	 System.out.printf("%c",a.charAt(i));
	}
	System.out.print('\n');
	for (i = a.length() - 1;i >= 0;i--)
	{
	   if (a.charAt(i) == '(')
	   {
		  for (j = i + 1;j < a.length();j++)
		  {
			 if (a.charAt(j) == ')')
			 {
			 a = tangible.StringFunctions.changeCharacter(a, i, ' ');
			 a = tangible.StringFunctions.changeCharacter(a, j, ' ');
			 break;
			 }
		  }
	   }
	}
	for (i = 0;i < a.length();i++)
	{
	   if (a.charAt(i) == '(')
	   {
		   a = tangible.StringFunctions.changeCharacter(a, i, '$');
	   }
	   else if (a.charAt(i) == ')')
	   {
		   a = tangible.StringFunctions.changeCharacter(a, i, '?');
	   }
	   else
	   {
		   a = tangible.StringFunctions.changeCharacter(a, i, ' ');
	   }
	   System.out.printf("%c",a.charAt(i));
	}
	System.out.print('\n');
	}

	return 0;
	}


}

