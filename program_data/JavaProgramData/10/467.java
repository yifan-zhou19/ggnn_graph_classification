package <missing>;

public class GlobalMembers
{
	public static int[] d = new int[100];
	public static int[] a = new int[100];
	public static int i;
	public static int j;
	public static int k;
	public static int n;
	public static int ans;

	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[0] = 1000000000;
		for (i = 1;i <= n;++i)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		d[0] = 0;
		ans = 0;
		for (i = 1;i <= n;++i)
		{
			d[i] = 1;
			for (j = 0;j < i;++j)
			{
				if (a[i] <= a[j] != 0 && d[j] + 1> d[i])
				{
					d[i] = d[j] + 1;
				}
			}
			if (d[i] > ans)
			{
				ans = d[i];
			}
		}
		System.out.printf("%d\n",ans);
		return 0;
	}
}

