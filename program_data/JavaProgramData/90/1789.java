package <missing>;

public class GlobalMembers
{
	public static int function(int m,int n)
	{
		if (m < 0 || n == 0)
		{
			return 0;
		}
		if (m == 1 || n == 1 || m == 0)
		{
			return 1;
		}
		else
		{
			return (function(m - n, n) + function(m, n - 1));
		}
	}
	public static int Main()
	{
		int t;
		int m;
		int n;
		int i;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < t;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(function(m, n));
			System.out.print("\n");
		}
	}
}

