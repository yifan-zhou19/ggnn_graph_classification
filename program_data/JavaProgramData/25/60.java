package <missing>;

public class GlobalMembers
{
	public static int[] result = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

	public static void power2(int n)
	{
		int i;
		int j = 0;

		for (i = 0 ; i < 50 ; i++)
		{
			result[i] = result[i] * 2;
		}

		for (i = 0 ; i < 50 ; i++)
		{
			if (result[i] >= 10)
			{
				result[i + 1] = result[i + 1] + result[i] / 10;
				result[i] = result[i] % 10;
			}
		}

		if (n == 1)
		{
			i = 50 - 1;

			while (result[i] == 0)
			{
				i--; //???????0??
			}

			for (; i >= 0 ; i--)
			{
				System.out.print(result[i]);
			}

			System.out.print("\n");

			return;
		}

		else
		{
			if (n == 0)
			{
				System.out.print(1);
				return;
			}
			else
			{
				power2(n - 1);
			}
		}
	}

	public static int Main()
	{
		int n;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		power2(n);

		return 0;
	}
}

