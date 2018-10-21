package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[300]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * ps;
		int count = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		char i = 'a';
		int f = 0;
		for (i = 'a';i <= 'z';i++)
		{
			for (ps = str; * ps != '\0';ps++)
			{
				if (*ps == i)
				{
					f += 1;
					count++;
				}
			}
	if (count > 0)
	{
			System.out.printf("%c=%d\n",i,count);
	}
	   count = 0;
		}
		if (f == 0)
		{
			System.out.print("No");
		}
		return 0;
	}
}

