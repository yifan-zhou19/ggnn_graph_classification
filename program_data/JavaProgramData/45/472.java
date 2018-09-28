package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c1 = new String(new char[50]);
		String c2 = new String(new char[50]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * r;
		String p1;
		String p2;
		int n;
		int m1;
		int m2;
		p1 = c1;
		p2 = c2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p2 = tempVar2.charAt(0);
		}
		m1 = p1.length();
		m2 = p2.length();
		for (q = p2;q <= p2.Substring(m2) - 1;q++)
		{
			if (*q == p1)
			{
				n = 0;
				for (r = q + 1;r <= q + m1 - 1;r++)
				{
					if (*r != *(p1 + (r - q)))
					{
						n = 1;
					}
				}
				if (n == 0)
				{
					System.out.printf("%d\n",q - p2);
					break;
				}
			}
		}
	}
}

