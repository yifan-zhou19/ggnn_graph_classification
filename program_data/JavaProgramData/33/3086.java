package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String str = new String(new char[256]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			char * ps;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str = tempVar2.charAt(0);
			}
			for (ps = str; * ps != '\0';ps++)
			{
				if (*ps == 'A')
				{
					*ps = ps - 'A'+'T';
				}
				else if (*ps == 'T')
				{
					*ps = ps - 'T'+'A';
				}
				else if (*ps == 'C')
				{
					*ps = ps - 'C'+'G';
				}
				else if (*ps == 'G')
				{
					*ps = ps - 'G'+'C';
				}
			}
			System.out.printf("%s\n",str);
		}
		return 0;
	}
}

