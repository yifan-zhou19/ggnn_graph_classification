package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int l;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String c = new String(new char[2000]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			l = c.length();
			p = c;
			for (p = c;p < c.Substring(l);p++)
			{
				 if (*p == 'A')
				 {
					 System.out.print("T");
				 }
				 if (*p == 'T')
				 {
					 System.out.print("A");
				 }
				 if (*p == 'G')
				 {
					 System.out.print("C");
				 }
				 if (*p == 'C')
				 {
					 System.out.print("G");
				 }
			}
			System.out.print("\n");
		}
		return 0;
	}
}

