package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
		String m;
		int n;
		int i;
		String s = new String(new char[1000]);
		while (gets(s))
		{
		n = s.length();
		m = s.charAt(0);
		for (p1 = s;p1 < (s.Substring(n) - 4);p1++)
		{
			if (*p1 > m)
			{
				m = p1;
			}
		}
		for (p1 = s;p1 < (s.Substring(n) - 4);p1++)
		{
			if (p1 < m)
			{
				System.out.printf("%c",*p1);
			}
			if (p1 == m)
			{
				System.out.printf("%c%c%c%c",*p1,s.charAt(n - 3),s.charAt(n - 2),s.charAt(n - 1));
			}
			if (p1 > m)
			{
				System.out.printf("%c",*p1);
			}
		}
	System.out.print("\n");
		}
	return 0;
	}
}
