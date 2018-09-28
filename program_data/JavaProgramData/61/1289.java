package <missing>;

public class GlobalMembers
{
	public static int[] sum = new int[21];
	public static void calculate(int t)
	{
		if (t <= 21)
		{
			sum[t] = sum[t - 1] + sum[t - 2];
			calculate(t + 1);
		}
	}

	public static int Main()
	{
		int n;
		int i;
		int a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sum[1] = sum[2] = 1;
		calculate(3);
		for (i = 1; i <= n; i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(sum[a]);
			System.out.print("\n");
		}

		return 0;
	}
}

