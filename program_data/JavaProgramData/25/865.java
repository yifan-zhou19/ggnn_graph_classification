package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] num = new int[1001];
		num[1000] = 1;
		int i;
		int j;
		while (n-- != 0)
		{
			for (i = 1000;i > 0;i--)
			{
				num[i] = num[i] * 2;
			}
			for (i = 1000;i > 0;i--)
			{
				if (num[i] >= 10)
				{
					num[i] = num[i] - 10;
					num[i - 1] = num[i - 1] + 1;
				}
			}
		}
		for (i = 0;i <= 1000;i++)
		{
			if (num[i] != 0)
			{
				for (j = i;j <= 1000;j++)
				{
					System.out.print(num[j]);
				}
				break;
			}
		}

		return 0;
	}
}

