package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		p = a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			*p++ = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (p--;p > a;)
		{
			System.out.print(p--);
			System.out.print(' ');
		}
		System.out.print(p);
		return 0;
	}

}

