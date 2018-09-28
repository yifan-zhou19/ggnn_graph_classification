package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[20]);
		String b = new String(new char[20]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p2;
		int i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		if (a.length() != b.length())
		{
			System.out.print("NO");
		}
		else
		{
			for (p1 = a;p1 < a + a.length();p1++)
			{
				for (p2 = b;p2 < b + b.length();p2++)
				{
					if (*p1 == *p2)
					{
						*p1 = p2 = '0';
					}
				}
			}
			for (p1 = a;p1 < a + a.length();p1++)
			{
				if (*p1 == '0')
				{
					i++;
				}
			}
			if (i == a.length())
			{
				System.out.print("YES");
			}
			else
			{
				System.out.print("NO");
			}
		}
		return 0;
	}


}

