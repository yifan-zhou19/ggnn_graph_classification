package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] re = new int[100];
		re[0] = 1;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 100;j++)
			{
				re[j] = re[j] * 2;
			}
			for (j = 0;j < 100;j++)
			{
				if (re[j] >= 10)
				{
					re[j + 1] += re[j] / 10;
					re[j] = re[j] % 10;
				}
			}
		}
		for (i = 50;i >= 0;i--)
		{
			if (re[i] != 0)
			{
				j = i + 1;
				break;

			}
		}
		while (j-- != 0)
		{
			System.out.print(re[j]);
		}

		return 0;
	}


}

