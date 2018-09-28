package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String a = "";
		final String b = "";
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pa = a;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pb = b;
		int i;

		a = new Scanner(System.in).nextLine();
		for (i = 0; i < a.length() - 1; i++)
		{
			* pb =  pa + * (pa + 1);
			pb++;
			pa++;
		}
		* pb =  pa + * a;
		System.out.printf("%s",b);
		return 0;
	}
}
