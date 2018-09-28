package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int l;
		int a;
		int t;
		int k;
		String s = new String(new char[101]);
		String b = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		s = new Scanner(System.in).nextLine();
		l = s.length();
		for (p = s,q = b;p < s.Substring(l) - 1;p++,q++)
		{
			*q = p + *(p + 1);
		}
		*q = p + s.charAt(0);
		for (q = b;q < b.Substring(l);q++)
		{
			System.out.printf("%c",*q);
		}
		return 0;
	}
}
