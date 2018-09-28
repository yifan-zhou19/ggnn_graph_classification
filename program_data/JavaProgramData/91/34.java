package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = str;
		String ps = str;
		str = new Scanner(System.in).nextLine();
		for (;p < str + str.length() - 1;p++)
		{
			System.out.printf("%c",*p + *(p + 1));
		}
		System.out.printf("%c",*p + ps);
		return 0;
	}


}
