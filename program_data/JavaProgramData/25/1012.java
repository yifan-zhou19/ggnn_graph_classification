package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] re = new int[100];
		for (int x = 0;x < 100;x++)
		{
			re[x] = 0;
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0)
		{
			System.out.print("1");
			System.out.print("\n");
		}
		else if (n == 1)
		{
			System.out.print("2");
			System.out.print("\n");
		}
		else
		{
			re[99] = 2;
			for (i = 1;i < n;i++)
			{
				j = 99;
				while (j != 0)
				{
					re[j] = re[j] * 2;
					j--;
				}
				j = 99;
				while (j != 0)
				{
					if (re[j] >= 10)
					{
						re[j - 1] += re[j] / 10;
						re[j] = re[j] % 10;
					}
					j--;
				}
			}
			j = 0;
			while (re[j] == 0)
			{
				j++;
			}
			for (;j <= 99;j++)
			{
				System.out.print(re[j]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

