package <missing>;

public class GlobalMembers
{
	public static int sz(char a)
	{
		int m = 0;
		if (('0' <= a) && (a <= '9'))
		{
			m = 1;
		}
		return m;
	}
	public static int Main()
	{
		int i;
		int n;
		int k = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String a = new String(new char[30]);
		a = new Scanner(System.in).nextLine();
		p = a;
		n = a.length();
		for (i = 0;i < n;i++,p++)
		{
			if (sz(*p) == 1)
			{
				System.out.printf("%c",*p);
				k = 1;
			}
			else
			{
				if (k == 1)
				{
					System.out.print("\n");
					k = 0;
				}
			}
		}
		return 0;
	}
}
