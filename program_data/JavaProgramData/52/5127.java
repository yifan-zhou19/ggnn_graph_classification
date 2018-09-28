package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int[] a = new int[101];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p = null;
		int p = null;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		System.out.print(a[n - m + 1]);
		p = a[n - m + 2];
		while (p <= a[n])
		{
			System.out.print(' ');
			System.out.print(p++);
		}
		p = a[1];
		while (p <= a[n - m])
		{
			System.out.print(' ');
			System.out.print(p++);
		}
		return 0;
	}
}

