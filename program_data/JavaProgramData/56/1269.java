package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[80]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		char t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		for (p = str,q = p + str.length() - 1;p < q;p++,q--)
		{
			t = p;
			*p = q;
			*q = t;
		}
		System.out.printf("%s", str);
		return 0;
	}
}

