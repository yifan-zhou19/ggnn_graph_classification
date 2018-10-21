package <missing>;

public class GlobalMembers
{
	public static final int N = 1000000;
	public static int[] cnt = new int[N];
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int a;
		int b;
		int ans = -1;
		while (true)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a == 0 && b == 0)
			{
				break;
			}
			cnt[b]++;
			if (cnt[b] == n - 1)
			{
				ans = b;
			}
		}
		if (ans == -1)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		else
		{
			System.out.print(ans);
			System.out.print("\n");
		}
	}
}

