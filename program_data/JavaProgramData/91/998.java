package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		String a = new String(new char[130]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = a;
		a = new Scanner(System.in).nextLine();
		for (i = 1;i < a.length();i++)
		{
		System.out.print(*p + *(++p));
		}
		System.out.print(*p + *a);
		return 0;
	}
}
