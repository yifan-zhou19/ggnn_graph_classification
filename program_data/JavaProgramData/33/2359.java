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
		System.in.read();
		String base = new String(new char[256]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				base = tempVar2.charAt(0);
			}
			p = base;
			for (;p <= base.charAt(base.length() - 1);p++)
			{
				if (*p == 'A')
				{
					System.out.print("T");
				}
				if (*p == 'T')
				{
					System.out.print("A");
				}
				if (*p == 'C')
				{
					System.out.print("G");
				}
				if (*p == 'G')
				{
					System.out.print("C");
				}
				if (p == base.charAt(base.length() - 1))
				{
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

