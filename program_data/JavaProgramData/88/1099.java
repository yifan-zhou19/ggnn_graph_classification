package <missing>;

public class GlobalMembers
{
	public static String c = new String(new char[30]);
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		p = c;
		c = new Scanner(System.in).nextLine();
		while (*p != '\0')
		{
			while (*p < '0' || *p>'9')
			{
				p += 1;
				if (*p == '\0')
				{
					break;
				}
			}
			System.out.printf("%c",*p);
			p += 1;
			if (*p < '0' || *p>'9')
			{
				System.out.print("\n");
			}
		}
	}

}
