package <missing>;

public class GlobalMembers
{
	public static int way(int m, int n)
	{
		if (n == 1)
		{
			return 1;
		}

		 if (m > n)
		 {
			return way(m, n - 1) + way(m - n, n);
		 }
		 if (m < n)
		 {
			return way(m, n - 1);
		 }
		 if (m == n)
		 {
			 return way(m, n - 1) + 1;
		 }
	}

	public static int Main()
	{
		int i;
		int l;
		int a;
		int m;
		int n;
		l = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1 ; i <= l ; i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a = way(m, n);
			System.out.print(a);
			System.out.print("\n");
		}

		return 0;
	}

}

