package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String s = new String(new char[10000]);
		int i = 0;

		s = new Scanner(System.in).nextLine();
		p = s;
		for (p = s; * p != '\0';p++)
		{
			if (*p != '\0')
			{
				i++;
			}
		}

		for (p = s;p < s.Substring(i) - 1;p++)
		{
			System.out.printf("%c",*p + *(p + 1));
		}
		p = s;
		System.out.printf("%c",*p + *(p + i - 1));

	}

}
