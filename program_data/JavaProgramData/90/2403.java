package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t; //???????
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int f = new int(int,int);
		for (int i = 1;i <= t;i++)
		{
			int m;
			int n;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int ans;
			ans = f(n, m);
			System.out.print(ans);
			System.out.print("\n");
		}
		return 0;
	}
	public static int f(int pa,int pi)
	{
		int c = 0;

		if (pa == 1 || pi == 0)
		{
			c = 1;
		}
		if (pi < 0)
		{
			c = 0;
		}
		if (pa > 1 && pi >= 1)
		{
			c = f(pa - 1, pi) + f(pa, pi - pa);
		}
		return (c);
	}

}

