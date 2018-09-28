package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] f = {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int k;
		int a;
		int i;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (k = 2; k < a; k++)
			{
				f[k] = f[k - 2] + f[k - 1];
			}
			System.out.print(f[k - 1]);
			System.out.print("\n");
		}
		return 0;
	}
}

