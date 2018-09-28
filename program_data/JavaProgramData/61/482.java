package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] f = new int[21];
		f[0] = 1;
		f[1] = 1;
		f[2] = 1;
		for (int i = 3; i <= 20; i++)
		{
			f[i] = f[i - 1] + f[i - 2];
		}
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			int a;
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(f[a]);
			System.out.print("\n");
		}

		return 0;
	}
}

