package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		char[][] DNA = new char[1000][256];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				DNA[i] = tempVar2.charAt(0);
			}
			for (p = DNA[i]; * p != '\0';p++)
			{
				if (*p == 'A')
				{
					*p = 'T';
				}
				else if (*p == 'T')
				{
					*p = 'A';
				}
				else if (*p == 'G')
				{
					*p = 'C';
				}
				else if (*p == 'C')
				{
					*p = 'G';
				}
			}
		}

		for (int j = 0;j < n;j++)
		{
			System.out.printf("%s\n",DNA[j]);
		}

		return 0;
	}
}

