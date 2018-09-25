package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		String s1 = new String(new char[101]);

//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = s;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q = s1;
		String t = s;

		s = new Scanner(System.in).nextLine();
		for (p = s.Substring(1),q = s1;p < s + s.length(),q < s1 + s.length() - 1;p++,q++)
		{
			*q = (p - 1) + *p;
		}
		*q = (p - 1) + t;

		for (p = s1;p < s1 + s.length();p++)
		{
			System.out.printf("%c",*p);
		}

		return 0;
	}

}
