package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int n = 0;
		int[] a = new int[1000];
		int[] p = a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			p[0]++ = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (p = a + n - 1;p > a;p--)
		{
			System.out.print(p);
			System.out.print(" ");
		}
		System.out.print(p);
		return 0;
	}
}

