package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[31]);
		String w = new String(new char[31]);
		String pin;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * ps;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pw;
		int flag;
		int ls;
		int lw;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		ls = s.length();
		lw = w.length();
		ps = s;
		pw = w;
		for (;pw <= s.Substring(ls) - lw;pw++)
		{
			if (*pw == *ps)
			{
				pin = pw;
				flag = 1;
				for (; * ps != '\0';pw++,ps++)
				{
					if (*pw != *ps)
					{
						flag = 0;
						break;
					}
				}
				if (flag != 0)
				{
					System.out.printf("%d",pin - w);
					break;
				}
				pw = pin;
				ps = s;
			}
		}
	}
}

