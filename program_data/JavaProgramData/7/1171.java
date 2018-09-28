package <missing>;

public class GlobalMembers
{
	/*******************************
	/* ?  ?: ????
	/* ?  ?: ??? 1200012861
	/* ?  ?: 2012?12?24?
	*******************************/


	public static int Main()
	{
		String str = new String(new char[260]);
		String subStr = new String(new char[260]);
		String replace = new String(new char[260]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * start = str;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * node = null;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * rep = replace;
		int len;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		subStr = ConsoleInput.readToWhiteSpace(true).charAt(0);
		replace = ConsoleInput.readToWhiteSpace(true).charAt(0);
		node = tangible.StringFunctions.strStr(str, subStr);
		if (node == null)
		{
			while (*start != '\0')
			{
				System.out.print(start++);
			}
		}
		else
		{
			len = subStr.length();
			while (start != node)
			{
				System.out.print(start++);
			}
			while (*rep != '\0')
			{
				System.out.print(rep++);
			}
			node += len;
			while (*node != '\0')
			{
				System.out.print(node++);
			}
		}
		System.out.print("\n");
		start = null;
		node = null;
		rep = null;
		return 0;
	}
}

