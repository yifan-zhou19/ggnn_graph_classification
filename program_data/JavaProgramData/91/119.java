package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String A = "";
		int len;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pt;
		String pt1;
		char temp;
		pt = A;
		pt = new Scanner(System.in).nextLine();
		len = A.length();
		pt1 = temp;
		pt1 = *pt;
		for (i = 0;i < len - 1;i++)
		{
			*pt = pt + *(pt + 1);
			pt++;
		}
		*pt = pt + pt1;
		pt = A;
		System.out.println(pt);
		return 0;
	}
}
