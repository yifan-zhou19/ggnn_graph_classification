package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[256]);
		String b = new String(new char[256]);
		String c = new String(new char[256]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int lenth;
		int d;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = tempVar3.charAt(0);
		}
		p = tangible.StringFunctions.strStr(a,b);
		lenth = b.length();
		d = a.length();
		if (p != null)
		{
			for (i = 0;i < lenth;p++,i++)
			{
			*p = c.charAt(i);
			}
		}
		for (i = 0;i < d;i++)
		{
		System.out.printf("%c",a.charAt(i));
		}
	}

}

