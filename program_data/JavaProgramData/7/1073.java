package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String string = new String(new char[260]);
		String subString = new String(new char[260]);
		String replacement = new String(new char[260]);
		String string3 = new String(new char[260]);
		String = ConsoleInput.readToWhiteSpace(true);
		subString = ConsoleInput.readToWhiteSpace(true).charAt(0);
		replacement = ConsoleInput.readToWhiteSpace(true).charAt(0);
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char *p = strstr(String, subString);
		char p = tangible.StringFunctions.strStr(String, subString);
		if (p == null)
		{
			System.out.print(String);
			System.out.print("\n");
			return 0;
		}
		int i = 0;
		int j;
		int k;
		int len1 = subString.length();
		int len2 = replacement.length();
		for (i = 0; * (p + len1 + i) != '\0'; i++)
		{
			string3 = tangible.StringFunctions.changeCharacter(string3, i, *(p + len1 + i));
		}
		string3 = tangible.StringFunctions.changeCharacter(string3, i, '\0');
		p = '\0';
		String += replacement;
		String += string3;
		System.out.print(String);
		System.out.print("\n");
		return 0;
	}








}

