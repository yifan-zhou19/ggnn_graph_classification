package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] f = {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int j = 2;j < 20;j++)
		{
			f[j] = f[j - 1] + f[j - 2];
		}
		for (int i = 0;i < n;i++)
		{
			int x;
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(f[x - 1]);
			System.out.print("\n");
		}
		return 0;
	}
}

