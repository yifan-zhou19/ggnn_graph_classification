package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String a = "";
		a = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = a;
		char q = a.charAt(0);
		int i = 0;
		for (i = 0;i < a.length() - 1;i++)
		{
			*p = p + *(p + 1);
			p++;
		}
		*p += q;
		System.out.print(a);
		return 0;
	}
}
