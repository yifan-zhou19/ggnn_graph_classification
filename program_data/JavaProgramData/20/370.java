package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[11]);
		String b = new String(new char[4]);
		String c = new String(new char[15]);
		while (scanf("%s",a) != EOF)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				b = tempVar.charAt(0);
			}
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			char * pa;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			char * pb;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			char * pc;
			String pm;
			int len;
			pa = a;
			pb = b;
			pm = pa;
			len = a.length();
			for (;pa < a.Substring(len);pa++)
			{
				if (pm < *pa)
				{
					pm = pa;
				}
			}
			for (pa = a,pc = c;pa <= pm;pa++,pc++)
			{
				*pc = pa;
			}
			for (pb = b;pb < (b.Substring(3));pb++,pc++)
			{
				*pc = pb;
			}
			for (;pa < (a.Substring(len));pa++,pc++)
			{
				*pc = pa;
			}
			*pc = '\0';
			System.out.printf("%s\n",c);
		}
		return 0;
	}

}

