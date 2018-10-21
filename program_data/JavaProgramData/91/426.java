package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[1000]);
	public static String b = new String(new char[1000]);
	public static int Main()
	{
		int i = 0;
//C++ TO JAVA CONVERTER TODO TASK: Variables cannot be declared in if/while/switch conditions in Java:
		while (scanf("%c",a.charAt(i++)) != EOF)
		{
			;
		}
		for (i = 0;i < a.length() - 1;i++)
		{
			if (i != a.length() - 2)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i) + a.charAt(i + 1));
			}
			else if (i == a.length() - 2)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i) + a.charAt(0));
			}
		}
		System.out.printf("%s",b);
		return 0;
	}

}

