package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[30]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		s = new Scanner(System.in).nextLine();
		p = s.charAt(0);
		for (;p < p + 30;p++)
		{
			if (*p >= '0' && *p <= '9')
			{
				System.out.printf("%c",*p);
			}
			else if (p > s)
			{
				if (*(p - 1) >= '0' && *(p - 1) <= '9')
				{
					System.out.print("\n");
				}
			}
			if (*p == '\0')
			{
				break;
			}
		}
		return 0;
	}
}
