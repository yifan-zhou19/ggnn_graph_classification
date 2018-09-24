package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * a_pointer = null;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a_pointer = a;
		for (int i = 0;i < n;i++)
		{
			*a_pointer++ = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		*a_pointer--;
		for (int i = 0;i < n - 1;i++)
		{
			System.out.print(a_pointer--);
			System.out.print(' ');
		}
		System.out.print(a_pointer);
		return 0;
	}

}

