package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[110]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int len;
		s = new Scanner(System.in).nextLine();
		len = s.length();
		for (p = s;p < s.Substring(len);p++)
		{
			if (p == s - 1 + len)
			{
				System.out.printf("%c",(*p) + s.charAt(0));
			}
			else
			{
				System.out.printf("%c",(*p) + *(p + 1));
			}
		}
		return 0;
	}

}
