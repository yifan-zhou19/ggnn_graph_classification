package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		final int MAX_LEN = 210;
		int[] num = {0};
		num[1] = 1;

		for (int i = 1; i <= N; i++)
		{
			for (int k = 1; k <= N; k++)
			{
				num[k] *= 2;
			}
			for (int k = 1; k <= N; k++)
			{
				if (num[k] >= 10)
				{
					num[k + 1] = num[k + 1] + num[k] / 10;
					num[k] = num[k] % 10;
				}
			}
		}
		int j = MAX_LEN;
		while (num[j] == 0)
		{
			j--;
		}
		for (int k = j; k > 0; k--)
		{
			System.out.print(num[k]);
		}
		System.out.print("\n");
		return 0;
	}
}

