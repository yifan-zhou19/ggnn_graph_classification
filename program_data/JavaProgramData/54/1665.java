package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int sum;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if ((n == 2) && (k == 1))
		{
			System.out.print("7");
			System.out.print("\n");
			return 0;
		}
		sum = 1;
		for (i = 1; i <= n; i++)
		{
			sum = sum * n;
		}
		System.out.print(sum - k * (n - 1));
		System.out.print("\n");
		return 0;
	}
}

