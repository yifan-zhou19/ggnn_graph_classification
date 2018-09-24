package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int f = new int(int,int);
		System.out.print(f(n, m));
		System.out.print("\n");
		return 0;
	}
	public static int f(int a,int b)
	{
		int cr;
		if (a == b)
		{
			cr = a;
		}
		else if (a > b)
		{
			cr = f(a / 2, b);
		}
		else
		{
			cr = f(a, b / 2);
		}
		return cr;
	}
}

