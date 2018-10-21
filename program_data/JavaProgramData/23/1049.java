package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static sb(String a)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		int n;
		n = a.length();
		p = a + n - 1;
		while (*p != ' ' && p != a - 1)
		{
				p--;
		}
		q = p + 1;
		for (; * q != '\0' && *q != ' ';q++)
		{
				System.out.printf("%c",*q);
		}
		p--;
		for (;p >= a;p--)
		{
			System.out.print(" ");
			while (*p != ' ' && p != a - 1)
			{
				p--;
			}
			q = p + 1;
			for (; * q != '\0' && *q != ' ';q++)
			{
				System.out.printf("%c",*q);
			}
		}
	}
	public static int Main()
	{
		String a = new String(new char[1024]);
		a = new Scanner(System.in).nextLine();
		sb(a);
	}

}
