package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String string = new String(new char[101]);
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			String = tempVar;
		}
		String a = new String(new char[101]);
		int b = string.charAt(0) - '0';
		for (i = 0;string.charAt(i + 1) != '\0';i++)
		{
									  a = tangible.StringFunctions.changeCharacter(a, i, (b * 10 + string.charAt(i + 1) - '0') / 13 + '0');
									  b = (b * 10 + string.charAt(i + 1) - '0') % 13;
		}
		a = tangible.StringFunctions.changeCharacter(a, i, '\0');
		if (a.charAt(0) == '0')
		{
					 String c = new String(new char[101]);
					 c = a;
					 for (i = 0;c.charAt(i + 1) != '\0';i++)
					 {
						 a = tangible.StringFunctions.changeCharacter(a, i, c.charAt(i + 1));
					 }
					 a = tangible.StringFunctions.changeCharacter(a, i, '\0');
		}
		if (String[1] == '\0')
		{
					  a = tangible.StringFunctions.changeCharacter(a, 0, '0');
					  a = tangible.StringFunctions.changeCharacter(a, 1, '\0');
					  b = string.charAt(0) - '0';
		}
		if (String[2] == '\0' && ((String[0] - '0') * 10 + string.charAt(1) - '0') < 13)
		{
																  a = tangible.StringFunctions.changeCharacter(a, 0, '0');
																  a = tangible.StringFunctions.changeCharacter(a, 1, '\0');
																  b = (String[0] - '0') * 10 + string.charAt(1) - '0';
		}
		System.out.printf("%s\n",a);
		System.out.printf("%d",b);
		System.in.read();
		System.in.read();
	}
}

