package <missing>;

public class GlobalMembers
{
	/**
	 * ??????
	 * ???1000012844
	 * ??????????
	 **/



	public static int Main()
	{
		String str = new String(new char[101]);

		str = new Scanner(System.in).nextLine();

//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = str;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * start = null;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * end = null;

		for (; p < str.length() + str; p++)
		{
			if (*p == ' ' && *(p - 1) != ' ')
			{
				start = p;
			}
			if (*(p - 1) == ' ' && *p != ' ')
			{
				end = p - 1;
			}

			if (end > start)
			{
				p = start;
				while (end < str + str.length())
				{
					*((start++) + 1) = *((end++) + 1);
				}
			}
		}

		System.out.print(str);
	}
}
