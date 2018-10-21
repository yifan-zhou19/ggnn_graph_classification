package <missing>;

public class GlobalMembers
{
	public static int ans;
	public static int n;
	public static int[] a = new int[1000];
	public static int[] b = new int[1000];
	public static int cmp(int x, int y)
	{
		return (x > y);
	}
	public static int Main()
	{
		int i;
		int j;
		int an;
		int bn;
		while ((n != 0 && n = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			ans = 0;
			an = n;
			bn = n;
			for (i = 0; i < n; i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0; i < n; i++)
			{
				b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			sort(a,a + n,cmp);
			sort(b,b + n,cmp);
			for (i = 0, j = 0; i < an && j < bn;)
			{
				if (a[i] > b[j])
				{
					ans++;
					i++;
					j++;
				}
				else if (a[i] < b[j])
				{
					if (a[an - 1] < b[j])
					{
						ans--;
						an--;
						j++;
					}
				}
				else
				{
					if (a[an - 1] > b[bn - 1])
					{
						ans++;
						an--;
						bn--;
					}
					else
					{
						if (a[an - 1] < b[j])
						{
							ans--;
							an--;
							j++;
						}
						else if (a[an - 1] == b[j])
						{
							an--;
							j++;
						}
					}
				}
			}
			System.out.print(ans * 200);
			System.out.print("\n");
		}
		return 0;
	}
}

