package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		if (num == 0 || num == -0)
		{
			return 0;
		}

		int x = Math.abs(num);
		while (x % 10 == 0)
		{
			x /= 10;
		}

		int i = 0;
		int sum = 0;
		int[] sz = new int[100];
		for (;x != 0;x /= 10)
		{
			sz[i++] = x % 10;
		}

		x = i;
		for (i = 0;i < x;i++)
		{
			sum += sz[i] * Math.pow(10,(x - i - 1));
		}

		if (num < 0)
		{
			sum = -sum;
		}

		return sum;
	}

	public static int Main()
	{
		int num;
		int i;

		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				num = Integer.parseInt(tempVar);
			}
			System.out.printf("%d\n", reverse(num));
		}

		return 0;
	}
}

