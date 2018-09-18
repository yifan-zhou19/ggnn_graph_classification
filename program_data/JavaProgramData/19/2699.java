package <missing>;

public class GlobalMembers
{
	public static String s = new String(new char[1000]);
	public static String a = new String(new char[101]);
	public static String b = new String(new char[101]);
	public static String buf = new String(new char[101]);

	public static int Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int i;
		int i;
		int index;
		s = new Scanner(System.in).nextLine();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		index = 0;
		for (i = 0;i < s.length();i++)
		{
			if (s.charAt(i) == ' ' || (i == s.length() - 1))
			{
				if (i == s.length() - 1)
				{
					buf = tangible.StringFunctions.changeCharacter(buf, index++, s.charAt(i));
				}
				buf = tangible.StringFunctions.changeCharacter(buf, index, '\0');
				index = 0;
				if (!strcmp(buf,a))
				{
					System.out.printf("%s",b);
				}
				else
				{
					System.out.printf("%s",buf);
				}
				if (i != s.length() - 1)
				{
					System.out.print(" ");
				}
			}
			else
			{
				buf = tangible.StringFunctions.changeCharacter(buf, index++, s.charAt(i));
			}
		}
		return 0;
	}
}

