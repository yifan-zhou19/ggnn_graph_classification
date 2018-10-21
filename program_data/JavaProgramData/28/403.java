package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[1000]);
		int n;
		int m = 0;
		int i;
		s = new Scanner(System.in).nextLine();
		n = s.length();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			 char * p = s;
		for (i = 0;i <= n;i++,p++)
		{
			if (*p != ' ')
			{
				m++;
			}
				if (*p == ' ' && m != 0)
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
