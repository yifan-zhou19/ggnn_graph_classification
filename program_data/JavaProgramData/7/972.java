package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String str = "";
		final String substr = "";
		final String replace = "";
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		substr = ConsoleInput.readToWhiteSpace(true).charAt(0);
		replace = ConsoleInput.readToWhiteSpace(true).charAt(0);
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char * p = strstr(str, substr);
		char p = tangible.StringFunctions.strStr(str, substr);
		int i = 0;
		int flag = substr.length();
		if (p == null)
		{
			System.out.print(str);
			System.out.print("\n");
		}
		else
		{
			for (i = 0; str.Substring(i) < p; i++)
			{
				System.out.print(str.charAt(i));
			}
			System.out.print(replace);
			for (i = i + flag; i < str.length(); i++)
			{
				System.out.print(str.charAt(i));
			}
		}
		return 0;
	}
}

