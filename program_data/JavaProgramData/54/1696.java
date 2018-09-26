package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int k;
	public static int m;
	public static int g = 0;
	public static int Main()
	{
		void plu(int i);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int j = 1 ; g == 0 ; j++)
		{
			m = j * (n - 1);
			plu(0);
		}
		return 0;
	}
	public static void plu(int i)
	{
		if (i == n)
		{
			g = 1;
			System.out.print(m);
			return;
		}
		if (m % (n - 1) != 0)
		{
			return;
		}
		m = m * n / (n - 1) + k;
		return plu(i + 1);
	}
}

