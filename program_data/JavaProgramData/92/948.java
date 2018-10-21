package <missing>;

public class GlobalMembers
{
	public static final int MAXN = 1010;
	public static int n;
	public static int ans;
	public static int sum;
	public static int[] a = new int[MAXN];
	public static int[] b = new int[MAXN];

	public static int battle(int x,int y)
	{
		if (x == y)
		{
			return 0;
		}
		else
		{
		if (x > y)
		{
			return 1;
		}
		else
		{
			return -1;
		}
		}
	}

	public static int Main()
	{
		while (true)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (n == 0)
			{
				break;
			}
			for (int i = 0;i < n;++i)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (int i = 0;i < n;++i)
			{
				b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			sort(a,a + n);
			sort(b,b + n);
			for (int i = 0;i < n / 2;++i)
			{
				swap(a[i],a[n - i - 1]);
				swap(b[i],b[n - i - 1]);
			}
			ans = -2147483647;
			for (int i = 0;i <= n;++i)
			{
				sum = 0;
				for (int j = 0;j < i;++j)
				{
				  sum += battle(a[j], b[n - i + j]);
				}
				for (int j = 0;j < n - i;++j)
				{
				  sum += battle(a[n - j - 1], b[j]);
				}
				if (sum > ans)
				{
					ans = sum;
				}
			}
			System.out.print(ans * 200);
			System.out.print("\n");
		}
	}

}

