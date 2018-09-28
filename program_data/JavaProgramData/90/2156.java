package <missing>;

public class GlobalMembers
{
	public static int function(int m,int n,int min)
	{
		if (n == 1)
		{
			return 1;
		}
		int a = 0;
		for (int i = min;i <= m / n;i++) //bug :??min
		{
			a += function(m - i, n - 1, i);
		}
		return a;
	}

	public static int Main()
	{
		int t;
		int m;
		int n;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int w = 0;w < t;w++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(function(m, n, 0));
			System.out.print("\n");
		}
		return 0;
	}
}

