package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String s = new String(new char[LEN]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p2;
		int n;
		int i;
		int ct;
		int CT;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			CT = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			p1 = s;
			while (*p1 != 0)
			{
				ct = 0;
				p2 = s;
				while (*p2 != 0)
				{
					if (*p2 == *p1)
					{
						ct++;
					}
					p2++;
				}
				if (ct < 2)
				{
					System.out.printf("%c\n",*p1);
					CT++;
					break;
				}
				p1++;
			}
			if (CT < 1)
			{
				System.out.print("no\n");
			}
		}
	}
}

