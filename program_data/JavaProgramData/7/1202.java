package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[300]);
		String rep = new String(new char[300]);
		String sub = new String(new char[300]);
		s = ConsoleInput.readToWhiteSpace(true).charAt(0);
		sub = ConsoleInput.readToWhiteSpace(true).charAt(0);
		rep = ConsoleInput.readToWhiteSpace(true).charAt(0);
		if (tangible.StringFunctions.strStr(s, sub))
		{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char * t = strstr(s, sub);
			char t = tangible.StringFunctions.strStr(s, sub);
			t = '\0';
			System.out.print(s);
			System.out.print(rep);
			System.out.print((t + sub.length()));
			System.out.print("\n");
		}
		else
		{
			System.out.print(s);
			System.out.print("\n");
		}
		return 0;
	}
}

