package <missing>;

public class GlobalMembers
{
	public static int k = 0;
	public static int apple(int m, int n)
	{
		if (n == 1 || n == 0)
		{
			return 1;
		}
		if (m >= n)
		{
			return apple(m, n - 1) + apple(m - n, n);
		}
		if (m < n)
		{
			return apple(m, n - 1);
		}

	}
	public static int Main()
	{
		int t;
		int i;
		int[] M = new int[20];
		int[] N = new int[20];
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0 ; i < t ; i++)
		{
			M[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			N[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(apple(M[i], N[i]));
			System.out.print("\n");
		}
		return 0;
	}
}

