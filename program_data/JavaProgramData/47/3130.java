package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p = null;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (p = a;p < n + a;p++)
		{
			*p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (p = a + n - 1;p > a;p--)
		{
			System.out.print(p);
			System.out.print(" ");
		}
		p = a;
		System.out.print(p);
	}

}

