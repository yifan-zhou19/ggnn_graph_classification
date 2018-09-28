package <missing>;

public class GlobalMembers
{
	public static void p(int n) //??n???
	{
		int c;
		c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n != 1)
		{
			p(n - 1); //??????
		}
		if (n == 1) //???????????
		{
			System.out.print(c);
		}
		else
		{
			System.out.print(' ');
			System.out.print(c);
		}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		p(n);
		System.out.print("\n");
		return 0;
	}
}

