package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final int MAX_LEN = 1000;
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] num = new int[MAX_LEN];
		num[0] = 1;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < MAX_LEN;j++)
			{
				num[j] = num[j] * 2;
			}
			for (j = 0;j < MAX_LEN;j++)
			{
				if (num[j] >= 10)
				{
					num[j + 1] = num[j + 1] + num[j] / 10;
					num[j] = num[j] % 10;

				}
			}


		}
		i = MAX_LEN - 1;
		while (num[i] == 0)
		{
		i--;
		}
		for (;i >= 0;i--)
		{
		System.out.print(num[i]);
		}
		return 0;

	}

}

