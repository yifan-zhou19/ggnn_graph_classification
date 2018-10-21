package <missing>;

public class GlobalMembers
{
	public static void convert(tangible.RefObject<String> s)
	{
		int i;
		int l;
	l = s.argValue.length();
	for (i = 0;i < l;i++)
	{
		if (i == l - 1)
		{
	str = tangible.StringFunctions.changeCharacter(str, i, (*(s.argValue.Substring(l) - 1)) + (*(s.argValue.Substring(0))));
		}
	else
	{
	str = tangible.StringFunctions.changeCharacter(str, i, (*(s.argValue.Substring(i))) + (*(s.argValue.Substring(i) + 1)));
	}
	}
	str = tangible.StringFunctions.changeCharacter(str, i + 1, '\0');
	}
	public static String str = new String(new char[1000]);
	public static int Main()
	{
		String s = new String(new char[1000]);
	s = new Scanner(System.in).nextLine();
tangible.RefObject<String> tempRef_s = new tangible.RefObject<String>(s);
	convert(tempRef_s);
	s = tempRef_s.argValue;
	System.out.printf("%s",str);
	}

}

