package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int n;
		int[] p = a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (;p < a + n;p++)
		{
			p[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (p = a + n - 1;p > a;p--)
		{
			System.out.print(p);
			System.out.print(" ");
		}
		System.out.print(p);

	}

}

