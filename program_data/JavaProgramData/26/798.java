package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		String m = new String(new char[100]);
		int count = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q = m;
		str = new Scanner(System.in).nextLine();
		for (p = str; * p != '\0';p++)
		{
			if (*p != ' ')
			{
				*q = p;
				q++;
				count = 0;
			}
			if (*p == ' ')
			{
				count++;
			}
			if (count == 1)
			{
				*q = ' ';
				q++;
			}
		}
		*q = '\0';
		System.out.print(m);
		System.out.print("\n");
		return 0;
	}

}
