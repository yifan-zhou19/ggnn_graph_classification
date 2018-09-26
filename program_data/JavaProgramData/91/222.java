package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[101]);
		String b = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p2;
		String p;
		int n;
		p = a;
		p = new Scanner(System.in).nextLine();
		n = a.length();
		for (p2 = b,p1 = a;p1 < p.Substring(n) - 1;p1++,p2++)
		{
			*p2 = p1 + *(p1 + 1);
		}
		*p2 = p1 + p;
		p2++;
		*p2 = 0;
		p2 = b;
		System.out.printf("%s",p2);
	}
}
