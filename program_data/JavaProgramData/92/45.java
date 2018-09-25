package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int m;
	public static int ans;
	public static int k;
	public static int[] a = new int[10001];
	public static int[] b = new int[10001];

	public static int Main()
	{
		int i;
		while ((n != 0 && n != 0 = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			for (i = 1;i <= n;i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 1;i <= n;i++)
			{
				b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			ans = -1000000000;
			sort(a + 1,a + n + 1);
			sort(b + 1,b + n + 1);

			for (m = 0;m < n;m++)
			{
				k = -200 * m;
				for (i = m + 1;i <= n;i++)
				{
					if (a[i] > b[i - m])
					{
						k += 200;
					}
					else if (a[i] < b[i - m])
					{
						k -= 200;
					}
				}
				if (k > ans)
				{
					ans = k;
				}
			}
			System.out.print(ans);
			System.out.print("\n");
		}
		return 0;
	}

}

