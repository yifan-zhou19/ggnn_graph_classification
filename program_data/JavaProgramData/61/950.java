package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] f = new int[20];
		f[1] = 1;
		f[0] = 1;
		int n;
		int[] a = new int[20];
		for (int i = 2;i <= 19;i++)
		{
			f[i] = f[i - 1] + f[i - 2];
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i <= n - 1;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i <= n - 1;i++)
		{
			System.out.print(f[a[i] - 1]);
			System.out.print("\n");
		}

	}
}

