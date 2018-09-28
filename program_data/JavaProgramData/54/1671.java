package <missing>;

public class GlobalMembers
{
	//***************************
	//*????????        **
	//*?????? 1300012965 **
	//*???20131204          **
	//***************************
	public static int c;
	public static int s;
	public static int m;
	public static int n;
	public static int k;
	public static int f(int n, int m)
	{
		if (n == 0)
		{
			return 1;
		}
		else
		{
			if (m > n && m % c == k)
			{
				return f(n - 1, (c - 1) * (m - k) / c);
			}
			else
			{
				return 0;
			}
		}
	}

	public static int Main()
	{
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = n;
		for (m = k + n;;m += n)
		{
			t = f(n, m);
			if (t == 1)
			{
				break;
			}
		}
		System.out.print(m);
		System.out.print("\n");
		return 0;
	}
}

