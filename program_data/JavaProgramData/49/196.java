package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[80]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * h;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * t;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * f;
		int i;
		int j;
		int len;
		int flag = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		len = s.length();
		for (i = 2;i <= len;i++)
		{
			f = s;
			for (;f <= (s.Substring(len) - i);f++)
			{
				h = f;
				t = h + i - 1;
				for (j = 1;j <= (int)(i / 2);j++,h++,t--)
				{
					flag = 1;
					if (*h != *t)
					{
						flag = 0;
						break;
					}
				}
				if (flag != 0)
				{
					h = f;
					for (;h < f + i;h++)
					{
						System.out.printf("%c",*h);
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

