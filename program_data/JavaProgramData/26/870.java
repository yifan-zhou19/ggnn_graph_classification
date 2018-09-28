package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String mystring = new String(new char[101]);
		mystring = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = mystring;
		for (; * p != '\0';p++)
		{
			if (p == mystring)
			{
				System.out.print(p);
			}
			else if (*p != ' ')
			{
				System.out.print(p);
			}
			else if (*(p - 1) != ' ')
			{
				System.out.print(p);
			}
		}
		return 0;
	}
}
