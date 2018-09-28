package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int i;
		int[] f = new int[21];

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			f[1] = 1;
			f[2] = 1;
			if (a >= 3)
			{
				for (i = 3; i <= a; i++)
				{
					f[i] = f[i - 1] + f[i - 2];
				}
			}
			System.out.print(f[a]);
			System.out.print("\n");
		}
	}

}

