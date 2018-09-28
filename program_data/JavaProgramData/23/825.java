package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str1 = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String q;
		String a;
		int n;
		str1 = new Scanner(System.in).nextLine();
		n = str1.length();
		a = q = p = str1.Substring(n) - 1;
		for (;p >= str1;p--)
		{
			if (*p == ' ')
			{
				a = p - 1;
			for (p = p + 1;p <= q;p++)
			{
			System.out.printf("%c",*p);
			}
			System.out.print(" ");
			p = q = a;
			}
		}
		for (p = str1;p <= q;p++)
		{
		System.out.printf("%c",*p);
		}
	}
}
