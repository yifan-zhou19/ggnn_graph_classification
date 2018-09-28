package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
		String c = new String(new char[31]);
		c = new Scanner(System.in).nextLine();
		p = c;
		for (i = 0;i < c.length();i++)
		{
				if (*p >= '0' && *p <= '9')
				{
						System.out.print(p);
						m = 1;
				}
				else if (m == 1)
				{
						System.out.print("\n");
						*p;
						m = 0;
				}
				*p++;
		}
		System.out.print("\n");

		return 0;
	}

}
