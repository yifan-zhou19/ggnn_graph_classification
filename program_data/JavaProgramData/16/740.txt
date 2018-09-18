package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] num = new int[10000];
		int i = 0;
		int t = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		num[0] = n % 10;

		while (n / 10 != 0)
		{
			t = t + 1;
				num[t] = (n / 10) % 10;
				n = n / 10;
		}

		for (i;i <= t; i++)
		{
			System.out.print(num[i]);

		}

		return 0;

	}
}

