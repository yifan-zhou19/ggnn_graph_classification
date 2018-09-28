package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[2 * n];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * q = 0;
		for (p = a; p < a + n; p++)
		{
			*p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (q = a, p = a + n; q < a + n - m; p++, q++)
		{
			*p = q;
		}
		p = a + n - m;
		System.out.print(p);
		for (p = a + n - m + 1; p < a + n + n - m; p++)
		{
			System.out.print(" ");
			System.out.print(p);
		}


		return 0;
	}
}

