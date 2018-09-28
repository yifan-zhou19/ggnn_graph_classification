package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		String p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * a;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * b;
		String posa;
		String posb;
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
		a = posa = w;
		b = posb = s;
		for (; * a != 0;a++)
		{
			if (*a != *b)
			{
				continue;
			}
			posa = a;
			while (*a++==*b++)
			{
				if (*b == 0)
				{
					p = posa;
				}
			}
			b = posb;
		}

		System.out.printf("%d",p - w);
		return 0;
	}
}

