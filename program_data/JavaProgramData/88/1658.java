package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[31]);

//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		s = new Scanner(System.in).nextLine();
		p = s;
		while ((*p) != '\0')
		{
		for (;(*p) >= '0' && (*p) <= '9';p++)
		{
			System.out.printf("%c",*p);
		}

		if ((*p) != '\0')
		{
		p++;
		}
		System.out.print("\n");
		}
		return 0;
	}
}
