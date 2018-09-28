package <missing>;

public class GlobalMembers
{
	public static int zhonglei(int m,int n)
	{
		int temp;
		if (m == 0)
		{
			return 1;
		}
		else if (m == 1)
		{
			return 1;
		}
		else if (n == 1)
		{
			return 1;
		}
		else if (m < 0)
		{
			return 0;
		}
		else
		{
			temp = zhonglei(m - n, n);
			temp = temp + zhonglei(m, n - 1);
			return temp;
		}
	}
	public static int Main()
	{
		int t;
		int i;
		int tm;
		int tn;
		int tk;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < t;i++)
		{
			tm = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			tn = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			tk = zhonglei(tm, tn);
			System.out.print(tk);
			System.out.print("\n");
		}
		return 0;
	}

}

