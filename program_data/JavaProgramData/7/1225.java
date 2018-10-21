package <missing>;

public class GlobalMembers
{
	//********************************************************
	//??:????                                         **
	//??:??         1200012935                          **
	//??:2012.12.28                                       **

	public static int Main()
	{
		String p = null;
		String str = new String(new char[100]);
		String substr = new String(new char[100]);
		String restr = new String(new char[100]);
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		substr = ConsoleInput.readToWhiteSpace(true).charAt(0);
		restr = ConsoleInput.readToWhiteSpace(true).charAt(0);
		p = tangible.StringFunctions.strStr(str, substr);
		if (p != null) //????????
		{
			restr += p + substr.length(); //?????????????restr??
			p = '\0'; //????
			str += restr; //???????restr???str??
		}
			System.out.print(str);

		return 0;
	}
}

