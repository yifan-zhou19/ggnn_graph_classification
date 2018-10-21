package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int len;
		String a = new String(new char[101]);
		final String b = "";
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pa;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pb;

		a = new Scanner(System.in).nextLine();
		len = a.length();
		for (pa = a,pb = b;pa < a.Substring(len) - 1;pa++,pb++)
		{
			*pb = pa + *(pa + 1);
		}
		*pb = pa + *a;
		System.out.printf("%s\n",b);
		return 0;
	}

}
