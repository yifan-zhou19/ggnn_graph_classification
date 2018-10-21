package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[] a = new int[2000];
	public static int[] b = new int[2000];
	public static int ans;

	public static int Main()
	{
		int i;
		int j;
		int k;
		while ((n != 0 && n != 0 = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			for (i = 0;i < n;i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0;i < n;i++)
			{
				b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			sort(a,a + n);
			sort(b,b + n);
			ans = -200 * n;
			for (j = 0;j < n;j++)
			{
				k = 0;
				for (i = 0;i < n;i++)
				{
					if (a[i] > b[(i + j) % n])
					{
						k += 200;
					}
					if (a[i] < b[(i + j) % n])
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

