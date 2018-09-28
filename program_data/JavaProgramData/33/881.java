package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		char[][] s = new char[N][L + 1];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = tempVar2.charAt(0);
			}
			for (p = s[i]; * p != '\0';p++)
			{
				if (*p == 'A')
				{
					*p = 'T';
				}
				else if (*p == 'T')
				{
					*p = 'A';
				}
				else if (*p == 'C')
				{
					*p = 'G';
				}
				else if (*p == 'G')
				{
					*p = 'C';
				}
			}
			System.out.println(s[i]);
		}
		return 0;
	}
}

