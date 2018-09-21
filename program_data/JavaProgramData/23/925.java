package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
		String p2;

		s = new Scanner(System.in).nextLine();
		p1 = s + s.length();
		while (p1 + 1 > s)
		{
			for (p2 = p1, p2 = 0; * p1 != ' ' && p1 >= s;p1--)
			{
				;
			}
			if (p1 + 1 > s)
			{
				System.out.printf("%s",p1 + 1);
				System.out.print(' ');
			}
			else
			{
				System.out.println(s);
			}
		}
	}

}
