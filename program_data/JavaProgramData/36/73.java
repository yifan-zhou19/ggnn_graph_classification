package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m = 0;
		int i;
		int l;
		int n = 0;
		String a = new String(new char[20]);
		String b = new String(new char[20]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p2;
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
		p1 = a;
		p2 = b;
		int x;
		int y;
		x = a.length();
		y = b.length();
		if (x != y)
		{
			System.out.print("NO\n");
		}
		else
		{
			for (i = 0;i < x;i++,p1++)
			{
				for (l = 0;l < x;l++,p2++)
				{
					if ((*p1) == (*p2))
					{
						n = 1;
					}
				}
				if (n == 0)
				{
					m = 0;
				}
				else
				{
					m = 1;
				}
				p2 = b;
			}

		if (m == 0)
		{
			System.out.print("NO\n");
		}
		else
		{
			System.out.print("YES\n");
		}
		}
	}
}

