package <missing>;

public class GlobalMembers
{
	public static void gaoxiao(int m,int n)
	{
		if (m > n)
		{
			m = m / 2;
		}
		if (m < n)
		{
			n = n / 2;
		}
		if (m == n)
		{
			System.out.print(m);
			System.out.print("\n");
		}
		else
		{
			gaoxiao(m, n);
		}
	}
	public static int Main()
	{
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		gaoxiao(m, n);
		char mm;
		mm = ConsoleInput.readToWhiteSpace(true).charAt(0);
		return 0;
	}


}

