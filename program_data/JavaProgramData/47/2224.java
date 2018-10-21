package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int[] p = a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (p < a + n)
		{
			p[0]++ = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		p--;
		while (p > a)
		{
			System.out.print(p--);
			System.out.print(" ");
		}
		System.out.print(p);
		return 0;
	}

}

