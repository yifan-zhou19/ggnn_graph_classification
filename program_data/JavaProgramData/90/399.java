package <missing>;

public class GlobalMembers
{
	 // ?????????
	 // ??????
	 // ???2010?12?5?
	 // ????????


	public static int fang(int m, int n)
	{
		int s;
		if (m == 0 || n == 1)
		{
		return 1;
		}
		else
		{
		if (m < n)
		{
		s = fang(m, m);
		}
		else
		{
		s = fang(m - n, n) + fang(m, n - 1);
		}
		return s;
		}
	}
	public static int Main()
	{
		int t; // ??????????
		int a;
		int b;
		int i;
		int d;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= t;i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			d = fang(a, b);
			System.out.print(d);
			System.out.print("\n");
			a = 0;
			b = 0;
			d = 0;
		}
		return 0;
	}
}

