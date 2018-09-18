package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String a = "";
		final String b = "";
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q = null;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
		int temp = 0;
		while ((a = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		temp = 0;
		for (p = a;p < a + a.length();p++)
		{
			if (*p > temp)
			{
				temp = p;
			}
		}
		for (p = a;p < a + a.length();p++)
		{
			if (*p == temp)
			{
				break;
			}
		}
		for (q = a;q <= p;q++)
		{
			System.out.print(q);
		}
		System.out.print(b);
		for (q = p + 1;q < a + a.length();q++)
		{
			System.out.print(q);
		}
		System.out.print("\n");
		}
		return 0;
	}

}

