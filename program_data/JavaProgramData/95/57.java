package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		String s = new String(new char[100]);
		String t = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * ps;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pt;
		final String da = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		final String xiao = "abcdefghijklmnopqrstuvwxyz";
		s = new Scanner(System.in).nextLine();
		t = new Scanner(System.in).nextLine();
		for (ps = s,pt = t; * ps != '\0',*pt != '\0';ps++,pt++)
		{
			for (i = 0;i < 27;i++)
			{
				if (*ps == da.charAt(i))
				{
					*ps = xiao.charAt(i);
				}
				if (*pt == da.charAt(i))
				{
					*pt = xiao.charAt(i);
				}
			}
		}
		n = strcmp(s,t);
		if (n > 0)
		{
			System.out.print(">\n");
		}
		if (n < 0)
		{
			System.out.print("<\n");
		}
		else
		{
			System.out.print("=\n");
		}
	}
}
