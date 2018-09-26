package <missing>;

public class GlobalMembers
{
	//????
	//2010?11?13?
	//1000012753 ???
	public static int Main()
	{
		int[] a = new int[200];
		int n;
		int m;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = m; i < m + n; ++i)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (p = a + n; p < a + n + m; ++p)
		{
			*(p - n) = *p;
		}
		System.out.print(a);
		for (p = a + 1; p < a + n; ++p)
		{
			System.out.print(" ");
			System.out.print(p);
		}
		System.out.print("\n");
		return 0;
	}
}

