package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[101]);
		String friend = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = str;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q = friend;
		str = new Scanner(System.in).nextLine();
		while (p < str + str.length() - 1)
		{
			*q++= *p + *(p + 1);
			p++;
		}
		*q = p + *str;
		*(friend + str.length()) = 0;
		System.out.println(friend);
		return 0;
	}
}
