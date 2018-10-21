package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[301]);
		final String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * ps;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pt;
		int count = 0;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		for (ps = s; * ps != '\0';ps++)
		{
			t = 0;
			for (pt = str; * pt != '\0';pt++)
			{
				if (*pt == *ps)
				{
					t++;
					count++;
				}
			}
			if (t > 0)
			{
				System.out.printf("%c=%d\n",*ps,t);
			}
		}
		if (count == 0)
		{
			System.out.print("No");
		}

		return 0;
	}
}

