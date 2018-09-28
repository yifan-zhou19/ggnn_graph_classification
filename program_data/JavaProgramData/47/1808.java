package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] c = new int[100];
		for (int i = 1;i <= n;i++)
		{
				int a;
				a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				c[n - i] = a;
		}
		for (int t = 1;t <= (n - 1);t++)
		{
		System.out.print(c[t - 1]);
		System.out.print(' ');
		}
		System.out.print(c[n - 1]);

		return 0;
	}
}

