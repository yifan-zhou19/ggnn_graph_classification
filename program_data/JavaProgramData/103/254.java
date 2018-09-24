package <missing>;

public class GlobalMembers
{
	public static void change(tangible.RefObject<String> a)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = a.argValue;
		while (*p != '\0')
		{
			if (*p >= 'a' && *p <= 'z')
			{
				*p += 'A' - 'a';
			}
			p++;
		}
		return;
	}
	public static int Main()
	{
		String str = new String(new char[1001]);
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int count = 1;
	tangible.RefObject<String> tempRef_str = new tangible.RefObject<String>(str);
		change(tempRef_str);
		str = tempRef_str.argValue;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = str;
		while (*p != '\0')
		{
			if (*p == *(p + 1))
			{
				count++;
			}
			else
			{
				System.out.printf("(%c,%d)",*p,count);
				count = 1;
			}
			p++;
		}
		return 0;
	}
}

