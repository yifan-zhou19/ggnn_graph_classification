package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[] f = new int[20];

	public static void fb(int i)
	{
		if (i == 0 || i == 1)
		{
			f[i] = 1;
		}
		else
		{
			f[i] = f[i - 1] + f[i - 2];
		}
	}

	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < 20;i++)
		{
			fb(i);
		}
		while (n > 0)
		{
			int m = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(f[m - 1]);
			System.out.print("\n");

			n--;
		}
	}
}

