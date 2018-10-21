package <missing>;

public class GlobalMembers
{
	/**************
	*?????
	*?????
	***************/
	public static int f1(int m, int n)
	{
		if (n == 1 || ((m < n) && (m == 0 || m == 1))) //??????
		{
			return 1;
		}
		else //?????????
		{
			if (m >= n)
			{
				return f1(m, n - 1) + f1(m - n, n);
			}
			else
			{
				return f1(m, m);
			}
		}
	}
	public static int Main()
	{
		int t; //t???
		int m;
		int n;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < t; i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(f1(m, n));
			System.out.print("\n");
		}
	return 0;
	}
}

