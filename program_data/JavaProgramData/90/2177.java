package <missing>;

public class GlobalMembers
{
	public static int k = 0;
	public static void put(int m, int n, int l) //m??????n?????l?????????????
	{
		int i;
		for (i = l; i <= m; i++)
		{
			if (m - i == 0) // ????
			{
				k++;
			}
			else if (n > 1) // ??
			{
				put(m - i, n - 1, i);
			}
		}
	}
	public static int Main()
	{
		int t;
		int m;
		int n;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (t != 0)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			k = 0; // k??0
			put(m, n, 1);
			System.out.print(k);
			System.out.print("\n");
			t--;
		}
		return 0;
	}

}

