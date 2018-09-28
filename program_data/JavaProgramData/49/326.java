package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[501]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * t;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * m;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int la;
		int i;
		int flag = 1;
		la = a.length();
		for (i = 1;i < la;i++)
		{
			for (p = a.Substring(i);p < a.Substring(la);p++)
			{
				flag = 1;
				for (t = p - i,m = p;t <= m;t++,m--)
				{
					if (*t != *m)
					{
						flag = 0;
						break;
					}
				}
				if (flag != 0)
				{
					for (t = p - i;t <= p;t++)
					{
						System.out.print(t);
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

