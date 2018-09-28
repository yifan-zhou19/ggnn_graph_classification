package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[101]);
		final String s2 = "";
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1 = s1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p2 = s2;
		int n;
		s1 = new Scanner(System.in).nextLine();
		n = s1.length();
		for (;p1 < s1.Substring(n) - 1;p1++,p2++)
		{
			*p2 = p1 + *(p1 + 1);
		}
		*p2 = p1 + s1.charAt(0);
		System.out.println(s2);
		return 0;
	}
}
