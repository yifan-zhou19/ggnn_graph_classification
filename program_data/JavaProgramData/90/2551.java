package <missing>;

public class GlobalMembers
{
	public static int F(int m,int n)
	{
		if (m == 0 || m == 1)
		{
			return 1;
		}
		if (n == 0 || n == 1)
		{
			return 1;
		}
		if (m < n)
		{
			return F(m, m);
		}
		else
		{
			return F(m - n, n) + F(m, n - 1);
		}
	}
	public static int Main()
	{
		int[] m = new int[20];
		int[] n = new int[20];
		int i;
		int t;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0 ; i < t ; i++)
		{
			m[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0 ; i < t ; i++)
		{
			System.out.print(F(m[i], n[i]));
			System.out.print("\n");
		}
		return 0;
	}

}

