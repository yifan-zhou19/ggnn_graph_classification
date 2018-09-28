package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[10000]);
		cin.get(str, 10000);
		int len = str.length();
		char temp = str.charAt(0);
		int i;
		for (i = 0; i < len - 1; i++)
		{
			str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i) + str.charAt(i + 1));
		}
		str = tangible.StringFunctions.changeCharacter(str, i, temp + str.charAt(i));
		str = tangible.StringFunctions.changeCharacter(str, i + 1, '\0');
		System.out.print(str);
		System.out.print("\n");
		return 0;
	}

}

