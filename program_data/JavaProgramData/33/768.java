package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 0;k <= n;k++)
		{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			char * p;
			String s = new String(new char[256]);
			s = new Scanner(System.in).nextLine();
			l = s.length();
			for (p = s,i = 0; * p;p++,i++)
			{
				if (i == l - 1)
				{
					if (*p == 'A')
					{
					System.out.print("T\n");
					}
				else if (*p == 'T')
				{
					System.out.print("A\n");
				}
				else if (*p == 'C')
				{
					System.out.print("G\n");
				}
				else if (*p == 'G')
				{
					System.out.print("C\n");
				}
				}
				else
				{
				if (*p == 'A')
				{
					System.out.print("T");
				}
				else if (*p == 'T')
				{
					System.out.print("A");
				}
				else if (*p == 'C')
				{
					System.out.print("G");
				}
				else if (*p == 'G')
				{
					System.out.print("C");
				}
				}
			}
		}
		return 0;
	}

}

