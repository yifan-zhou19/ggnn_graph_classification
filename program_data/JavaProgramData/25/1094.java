package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[50];
		int n;
		int k;
		int i;
		int j;
		int flag = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		num[1] = 2;
		for (k = 0;k < n - 1;k++)
		{
			i = 49;
			while (num[i] == 0)
			{
				i--;
			}

			for (j = 1;j <= i + 1;j++)
			{
				num[j] *= 2;
				if (num[j - 1] >= 10)
				{
					num[j - 1] -= 10;
					num[j] += 1;
				}

			}
		}

		if (n == 0)
		{
			System.out.print(1);
			System.out.print("\n");
		}
		else

		{
			i = 49;
		while (num[i] == 0)
		{
			i--; //???????0??
		}
		for (; i > 0; i--)
		{
			System.out.print(num[i]);
		}
		System.out.print("\n");
		}
		return 0;
	}
}

