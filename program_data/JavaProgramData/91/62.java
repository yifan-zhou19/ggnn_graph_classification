package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		String s1 = new String(new char[101]);
		s = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = s;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1 = s1;
		for (; * p != '\0';p++,p1++)
		{
			if (*(p + 1) != '\0')
			{
				*p1 = p + *(p + 1);
			}
			else
			{
				String p0 = s;
				*p1 = p + p0;
			}
		}
		*p1 = '\0';
		p1 = s1;
		System.out.printf("%s",p1);
		return 0;
	}
}
