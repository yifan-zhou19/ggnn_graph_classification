package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[600]);
		String subStr = new String(new char[260]);
		String rep = new String(new char[260]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(str, 0, (Character.SIZE / Byte.SIZE));
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			subStr = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			rep = tempVar3.charAt(0);
		}
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pos = tangible.StringFunctions.strStr(str, subStr);
		if (pos != null)
		{
			int len = rep.length();
			for (int i = 0; i < len; i++)
			{
				*pos++= rep.charAt(i);
			}
		}
		System.out.printf("%s", str);
	}
}

