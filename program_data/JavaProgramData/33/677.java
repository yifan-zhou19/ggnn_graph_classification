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
		String ml = new String(new char[256]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * ps;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				ml = tempVar2.charAt(0);
			}
			for (ps = ml; * ps != '\0';ps++)
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
				else
				{
					*ps = 'C';
				}
			}
			System.out.println(ml);
		}
	}


}

