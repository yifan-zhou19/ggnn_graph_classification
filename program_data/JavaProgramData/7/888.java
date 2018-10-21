package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000]);
		String substr = new String(new char[1000]);
		String replace = new String(new char[1000]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * r;
		String start;
		int len;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			substr = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			replace = tempVar3.charAt(0);
		}
		len = substr.length();
		for (p = str; * p != '\0';p++)
		{
			for (q = p,r = substr; * r != '\0';q++,r++)
			{
				if (*q != *r)
				{
					break;
				}
			}
			if (*r == '\0')
			{
					start = p;
				break;
			}
		}
		for (p = start,q = replace; * q != '\0';p++,q++)
		{
			*p = q;
		}
		System.out.printf("%s",str);
	}
}

