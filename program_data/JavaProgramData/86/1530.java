package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int j = 1;j <= n;j++)
		{
			int m;
			int ans = 60;
			int[] a = new int[30];
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int i = 1;i <= m;i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (int i = 1;i <= m;i++)
			{
				if (a[i] + 3 * (i - 1) >= 60)
				{
					break;
				}
				if (a[i] + 3 * i >= 60)
				{
					ans = a[i];
					break;
				}
				ans = ans - 3;
			}
			System.out.print(ans);
			System.out.print("\n");
		}
		return 0;
	}

}

