package <missing>;

public class GlobalMembers
{
	public static final int maxn = 100;
	public static int[] a = new int[maxn];
	public static int n;
	public static int[] f = new int[maxn];
	public static int ans;
	public static void init()
	{
		 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 for (int i = 0;i < n;i++)
		 {
			 a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
	}
	public static void solve()
	{
		 ans = 0;
		 for (int i = 0;i < n;i++)
		 {
			 f[i] = 1;
			 for (int j = 0;j < i;j++)
			 {
				 if (a[j] >= a[i] != 0 && f[j] >= f[i])
				 {
					f[i] = f[j] + 1;
				 }
			 }
			 if (f[i] > ans)
			 {
				ans = f[i];
			 }
		 }
	}
	public static int Main()
	{
		init();
		solve();
		System.out.print(ans);
		System.out.print("\n");
		return 0;
	}

}

