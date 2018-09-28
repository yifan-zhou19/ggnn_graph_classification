package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[600];
	public static int cnt = 0;
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
			int lt;
			lt = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (lt % 2 != 0)
			{
				a[++cnt] = lt;
			}
		}
		sort(a + 1,a + cnt + 1);
		for (int i = 1;i < cnt;i++)
		{
			System.out.print(a[i]);
			System.out.print(',');
		}
		System.out.print(a[cnt]);

	}
}

