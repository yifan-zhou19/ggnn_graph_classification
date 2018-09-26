package <missing>;

public class GlobalMembers
{
	public static void reverse(int n)
	{
		if (n > 0)
		{
			int c;
			char d;
			c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			d = System.in.read();
			reverse(n - 1);
			System.out.print(d);
			System.out.print(c);
		}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		reverse(n);
		return 0;
	}

}

