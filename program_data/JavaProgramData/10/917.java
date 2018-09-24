package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[] a = new int[MAXN + 10];
	public static int[] f = new int[MAXN + 10];

	public static int Main()
	{

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; ++i)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int ans = 0;
		for (int i = 0; i < n; ++i)
		{
			for (int j = 0; j < i; ++j)
			{
				if (a[j] >= a[i])
				{
					f[i] = Math.max(f[i], f[j]);
				}
			}
			f[i]++;
			ans = Math.max(ans, f[i]);
		}
		System.out.print(ans);
		System.out.print("\n");
		return 0;
	}

}

