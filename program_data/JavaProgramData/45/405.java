package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		String s = new String(new char[100]);
		String w = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		p = s;
		q = w;
		while (*p != *q)
		{
		q++;
		}
		for (i = 0;i < s.length();i++,p++,q++)
		{
			if (*p != *q)
			{
				break;
			}
		}
			if (i == s.length())
			{
				System.out.printf("%d",q - w - s.length());
			}
	}
}

