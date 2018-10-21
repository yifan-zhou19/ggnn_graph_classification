package <missing>;

public class GlobalMembers
{
	public static int[] f = new int[100];
	public static int i;
	public static int j;
	public static int k;

	public static void cal()
	{
		f[0] = 1;
		f[1] = 1;
		f[2] = 1;
		int i;
		for (i = 3;i < 21;i++)
		{
			f[i] = f[i - 1] + f[i - 2];
		}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		cal();
		while (n-- != 0)
		{
			int m;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(f[m]);
			System.out.print("\n");
		}
		return 0;
	}

}

