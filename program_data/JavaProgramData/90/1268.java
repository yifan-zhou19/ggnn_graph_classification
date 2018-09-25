package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n) //m??????n?????
	{
		if (m == 1 || n == 1 || m == 0)
		{
			return 1;
		}
		if (m < 0)
		{
			return 0;
		}
		return f(m, n - 1) + f(m - n, n);
	}
	public static int Main()
	{
		int t; //t?????????a?????b????
		int i = 1;
		int a;
		int b;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (i <= t)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(f(a, b));
			System.out.print("\n");
			i++;
		}
		return 0;
	}


}

