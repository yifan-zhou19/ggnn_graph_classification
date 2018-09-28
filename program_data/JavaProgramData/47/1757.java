package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[100];
	public static void c(int n)
	{
		int i;
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static void b(int n)
	{
		int i;
		for (i = n - 1;i > 0;i--)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print(a[0]);
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c(n);
		b(n);
		return 0;
	}

}

