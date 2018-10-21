package <missing>;

public class GlobalMembers
{
	public static int f1(int m,int n)
	{
		int cnt;
		if (m < 0)
		{
			 return 0;
		}
		else if (n == 1)
		{
			return 1;
		}
		else
		{
			cnt = f1(m, n - 1) + f1(m - n, n);
			return cnt;
		}
	}


	public static int Main()
	{
		int k;
		int m;
		int n;
		int i;
		int cnt;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= k;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			cnt = f1(m, n);
			System.out.print(cnt);
			System.out.print("\n");
		}
		return 0;
	}
}

