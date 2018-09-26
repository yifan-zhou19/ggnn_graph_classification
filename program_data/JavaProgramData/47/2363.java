package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int N = 0;
		int i = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p = a[0];
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < N;i++)
		{
		*p++ = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		System.out.print(--p);
		for (i = N - 2;i >= 0;i--)
		{
		System.out.print(" ");
		System.out.print(--p);
		}
		return 0;
	}
}

