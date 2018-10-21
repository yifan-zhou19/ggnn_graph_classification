package <missing>;

public class GlobalMembers
{
	/*??(15-11) ?????*/ 



	public static int types(int m, int n)
	{
		int num = 0;
		int i;
		if (m < n)
		{
			return types(m, m);
		}
		else
		{
			for (i = 0;i < n;i++)
			{
				num = num + full(m, n - i);
			}
			return num;
		}
	}

	public static int full(int m,int n) //m?????n???
	{
		if (m <= n != 0 || n == 1)
		{
			return 1;
		}
		else
		{
			return types(m - n, n);
		}
	}

	public static int Main()
	{
		int t;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (t-- != 0)
		{
			int m;
			int n;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(types(m, n));
			System.out.print("\n");
		}
		return 0;
	}
}

