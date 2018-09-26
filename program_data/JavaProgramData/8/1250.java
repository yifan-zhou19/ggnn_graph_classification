package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int m;
	public static int i;
	public static int j;
	public static int[] a = new int[10000];
	public static void input()
	{
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < n + m;i++)
	{
	a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	}

	public static void fsort()
	{
	 sort(a,a + n);
	 sort(a + n,a + n + m);
	}
	public static void print()
	{
		System.out.print(a[0]);
		for (i = 1;i < n + m;i++)
		{
		System.out.print(' ');
		System.out.print(a[i]);
		}
	}
	public static int Main()
	{
		input();
	 fsort();
	 print();
	return 0;
	}
}

