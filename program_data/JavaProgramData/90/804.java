package <missing>;

public class GlobalMembers
{
	// ?????
	// ??? 1100012820
	// 20111115
	//******************
	public static int place(int m, int n)
	{
		if (m < 0)
		{
			return 0;
		}
		if (n == 1)
		{
			return 1;
		}
		return place(m, n - 1) + place(m - n, n);
	}
	public static int Main()
	{
		int i;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			int k = 0;
			int M;
			int N;
			M = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(place(M, N));
			System.out.print("\n");
		}
		return 0;
	}
}

