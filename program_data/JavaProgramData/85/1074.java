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
			if ((*p > 64 && *p < 91) || (*p == 95) || (*p>96 && *p < 123))
			{
			}
			else
			{
				System.out.print("no\n");
				continue;
			}
			for (p = c.Substring(1);p < c.Substring(l);p++)
			{
				if ((*p > 64 && *p < 91) || (*p == 95) || (*p>96 && *p < 123) || (*p>47 && *p < 58))
				{
							   if (p == c.Substring(l) - 1)
							   {
								   System.out.print("yes\n");
							   }
				}
				else
				{
					System.out.print("no\n");
					break;
				}
			}
		}
		return 0;
	}
}

