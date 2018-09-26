package <missing>;

public class GlobalMembers
{
	public static int put(int a, int b)
	{
		if ((a < 1) || (b < 1))
		{
		return 0;
		}
		if ((a == 1) || (b == 1))
		{
		return 1;
		}
		if (a < b)
		{
		return put(a, a);
		}
		if (a == b)
		{
		return put(a, b - 1) + 1;
		}
		if (a > b)
		{
		return put(a, b - 1) + put(a - b, b);
		}
	}
	public static int Main()
	{
		int m;
		int n;
		int t;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (t-- != 0)
		{
		   m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   System.out.print(put(m, n));
		   System.out.print("\n");
		}
		return 0;
	}



}

