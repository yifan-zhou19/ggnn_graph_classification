package <missing>;

public class GlobalMembers
{
	public static int[] num = {0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	public static void fib()
	{
	for (int i = 2;i < 30;i++)
	{
		num[i] = num[i - 1] + num[i - 2];
	}

	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		fib();
		while (n-- != 0)
		{
			int a;
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(num[a]);
			System.out.print("\n");
		}
		return 0;
	}

}

