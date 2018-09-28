package <missing>;

public class GlobalMembers
{
	/**
	 * ?? 1045?7??????
	 * ?? ???
	 * ?? 1000012844
	 */

	public static int Main()
	{
		int n;
		int i;
		int sum = 0;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		while (n < 1)
		{
			System.out.print(" Invalid n, input it again ");
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		//??????sum??
		for (i = 1; i <= n; i++)
		{
			//???7?????1?7??????7?10??7
			if ((i % 7 == 0) || ((i - 7) % 10 == 0) || ((i < 80) && (i >= 70)))
			{
			continue;
			}
			sum = sum + i * i; // ??
		}

		System.out.print(sum);
		return 0;
	}

}

