package <missing>;

public class GlobalMembers
{
	public static String reverse(tangible.RefObject<String> pt)
	{
		String term = new String(new char[501]);
		int i;
		term = pt.argValue;
		for (i = 0;i < pt.argValue.length();i++)
		{
			*(pt.argValue.Substring(i)) = *(term + pt.argValue.length() - i - 1);
		}
		return pt.argValue;
	}
	public static int Main()
	{
		String source = new String(new char[501]);
		String sub = new String(new char[501]);
		String term = new String(new char[501]);
		int len;
		int sublen;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = source;
		source = new Scanner(System.in).nextLine();
		len = source.length();
		for (sublen = 2;sublen <= len;sublen++)
		{
			for (p = source;p < source.Substring(len) - sublen + 1;p++)
			{
				sub = p.substring(0, sublen);
				*(sub.Substring(sublen)) = '\0';
				term = sub;
			tangible.RefObject<String> tempRef_term = new tangible.RefObject<String>(term);
				if (strcmp(sub,reverse(tempRef_term)) == 0)
				{
					term = tempRef_term.argValue;
					System.out.printf("%s\n", sub);
				}
				else
				{
					term = tempRef_term.argValue;
				}
			}
		}
		return 0;
	}
}

