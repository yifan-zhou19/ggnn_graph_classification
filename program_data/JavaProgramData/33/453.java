package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String str = new String(new char[260]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * ps;
		int a = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str = tempVar2.charAt(0);
			}
			for (ps = str; * ps != '\0';ps++)
			{
				if (*ps == 'A')
				{
				*ps = 'T';
				}
				else if (*ps == 'T')
				{
				*ps = 'A';
				}
				else if (*ps == 'C')
				{
				*ps = 'G';
				}
				else if (*ps == 'G')
				{
				*ps = 'C';
				}
			}
			System.out.printf("%s\n",str);
		}
		return 0;
	}
}

