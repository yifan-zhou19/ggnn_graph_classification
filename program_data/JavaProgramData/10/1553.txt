package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[] a = new int[MAXN];
	public static int[] f = new int[MAXN];

	public static void input()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}

	public static int Main()
	{
		input();
		for (int i = 0; i < n; i++)
		{
			f[i] = 1;
		}
		for (int i = 1; i < n; i++)
		{
			for (int j = 0; j < i; j++)
			{
				if (a[j] >= a[i] != 0 && f[j] + 1 > f[i])
				{
					f[i] = f[j] + 1;
				}
			}
		}
		int ans = 0;
		for (int i = 0; i < n; i++)
		{
			if (f[i] > ans)
			{
				ans = f[i];
			}
		}
		System.out.print(ans);
		System.out.print("\n");
	}
}

