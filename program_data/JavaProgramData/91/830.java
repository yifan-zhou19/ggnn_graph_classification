package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[100005]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String q;
		int n;
		s = new Scanner(System.in).nextLine();
		n = s.length();
		for (p = s;p < s.Substring(n) - 1;p++)
		{
			System.out.printf("%c",(*p + *(p + 1)));
		}
			System.out.printf("%c",(*s + *(s.Substring(n) - 1)));
	}
}
