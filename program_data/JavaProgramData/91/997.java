package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[101]);
		final String s1 = "\0";
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = s;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pp = s1;
		s = new Scanner(System.in).nextLine();
		for (; * p != '\0';p++,pp++)
		{
			if (*(p + 1) != '\0')
			{
				*pp = p + *(p + 1);
			}
			else
			{
				*pp = p + s.charAt(0);
			}
		}
		System.out.println(s1);
	}
}
