package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j = 0;
		int k = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p = 0;
		int[] a = new int[200];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = n; i < 2 * n - m; i++)
		{
			a[i] = a[j++];
		}

		p = a + n - m;
		for (i = 0; i < n - 1; i++)
		{
		System.out.print(p++);
		System.out.print(" ");
		}
		System.out.print(p);
		System.out.print("\n");
		return 0;
	}




}

