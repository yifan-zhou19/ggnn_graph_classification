package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[256]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * a;
		int n;
		int i;
		int j;
		int k;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 0;k < n;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfc = tempVar2.charAt(0);
			}
			for (a = zfc; * a != '\0';a++)
			{
				if (*a == 'A')
				{
					*a = 'T';
				}
				else if (*a == 'T')
				{
					*a = 'A';
				}
				else if (*a == 'C')
				{
					*a = 'G';
				}
				else
				{
					*a = 'C';
				}
			}
			System.out.printf("%s\n",zfc);
		}
		return 0;
	}

}

