package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[] k = new int[101];
		int n;
		int a;
		int b;
		int sum;
		int j;
		k[0] = 0;
		sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		i = 1;
		for (i = 1;i <= n;i = i + 1)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (a >= 90 && a <= 140 && b >= 60 && b <= 90)
		{
			k[i] = k[i - 1] + 1;
		}
		else
		{
			k[i] = 0;
		}

		}
		for (j = 1;j <= n;j++)
		{
			if (k[j] >= sum)
			{
				sum = k[j];
			}

		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;

	}
}

