package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String s1 = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * t;
		int n;

		s = new Scanner(System.in).nextLine();
		n = s.length();

		t = s1;
		for (p = s;p < s.Substring(n) - 1;)
		{
			*t = p + *(++p);
			t++;
		}
		*t = p + *s;

		for (t = s1;t < s1.Substring(n);t++)
		{
			System.out.printf("%c",*t);
		}
		return 0;
	}
}
