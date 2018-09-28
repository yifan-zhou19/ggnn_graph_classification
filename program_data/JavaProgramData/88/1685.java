package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		String c = new String(new char[31]);
		c = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = c;
		for (i = 0;c.charAt(i) != '\0';i++,p++)
		{
				if (*p >= '0' && *p <= '9')
				{
				System.out.printf("%c",*p);
				}
			else
			{
				if (*(p + 1) >= '0' && *(p + 1) <= '9')
				{
				System.out.print("\n");
				}
			}
		}

	}
}
