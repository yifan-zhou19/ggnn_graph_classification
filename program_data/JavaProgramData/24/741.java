package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
		String p2;
		String p3;
		String p4;
		String p5;
		int n;
		int m = 0;
		int a = 0;
		int b = 10000;
		int i;
		String s = new String(new char[1000]);
		s = new Scanner(System.in).nextLine();
		n = s.length();
		s = tangible.StringFunctions.changeCharacter(s, n, ' ');
		for (p1 = s;p1 < (s.Substring(n) + 1);p1++)
		{
			if (*p1 != ' ')
			{
				m = m + 1;
			}
			if (*p1 == ' ' || p1 == (s.Substring(n)))
			{
				if (m > a)
				{
					a = m;
					p2 = p1;
				}
				if (m < b)
				{
					b = m;
					p3 = p1;
				}
				m = 0;
			}
		}
		for (p4 = (p2 - a);p4 < p2;p4++)
		{
		System.out.printf("%c", p4);
		}
		System.out.print("\n");
		for (p5 = (p3 - b);p5 < p3;p5++)
		{
		System.out.printf("%c", p5);
		}

	}
}

