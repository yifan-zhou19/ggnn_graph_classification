package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[80]);
		s = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		p = s;
		int n;
		while (*p != '\0')
		{
			if (p - s > 0 && (*(p - 1) < '0' || *(p - 1) > '9') && n == 0)
			{
				System.out.print("\n");
				n++;
			}
			if (*p >= '0' && *p <= '9')
			{
				System.out.print(p);
				n = 0;
			}
			p++;
		}
		return 0;
	}
}
