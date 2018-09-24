package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[257]);
		String str2 = new String(new char[257]);
		String str3 = new String(new char[257]);
		str1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		str2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		str3 = ConsoleInput.readToWhiteSpace(true).charAt(0);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
		p = tangible.StringFunctions.strStr(str1,str2);
		if (p != null)
		{
			for (int i = 0;i < str3.length();i++)
			{
				*p = (str3.Substring(i));
				p++;
			}
		}
		System.out.printf("%s\n",str1);
		return 0;
	}
}

