package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int j;
		int[] f = {0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a == 1 || a == 2)
			{
				System.out.print(1);
				System.out.print("\n");
				continue;
			}
			for (j = 2; j < a; j++)
			{
				f[j + 1] = f[j] + f[j - 1];
			}
			System.out.print(f[j]);
			System.out.print("\n");
		}
		return 0;
	}
}

