package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		char t;
		int k;
		str = new Scanner(System.in).nextLine();
		k = str.length();
		t = str;

		for (p = str;p < str.Substring(k) - 1;p++)
		{
			*p = p + *(p + 1);
		}
		*p = p + t;

		System.out.println(str);
		return 0;
	}

}
