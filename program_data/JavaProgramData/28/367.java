package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m = 0;
		int n;
		String s = new String(new char[3000]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		s = new Scanner(System.in).nextLine();
		n = s.length();
		p = s.charAt(0);
		for (p = s;p <= s.Substring(n);p++)
		{
			if (*p != ' ')
			{
				m++;
			}
			if (*p == ' ' && m > 0)
			{
				System.out.printf("%d,",m);
				m = 0;
			}
			if (*p == '\0')
			{
				System.out.printf("%d",m - 1);
			}
		}
	}
}
