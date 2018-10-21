package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[256]);
		String sub = new String(new char[256]);
		String rep = new String(new char[256]);
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		sub = ConsoleInput.readToWhiteSpace(true).charAt(0);
		rep = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len = sub.length();
		int i = 0;
		String p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * r;
		p = tangible.StringFunctions.strStr(str, sub);
		q = rep;
		if (p != null)
		{
		for (r = p; r < p.Substring(len); r++)
		{
			*r = q++;
		}
		}
		System.out.print(str);
		System.out.print("\n");
		return 0;
	}

}

