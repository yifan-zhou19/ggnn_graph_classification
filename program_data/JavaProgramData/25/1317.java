package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int flag = 0;
		int[] num = new int[32];

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		num[0] = 2;

		for (i = 1; i <= n - 1; i++)
		{
			for (j = 0; j < 32; j++)
			{
				num[j] *= 2;
			}
			for (j = 0; j < 32; j++)
			{
				if (num[j] >= 10)
				{
					num[j] -= 10;
					num[j + 1]++;
				}
			}
		}


		if (n != 0)
		{
			for (j = 31; j >= 0; j--)
			{
				if (num[j] == 0 && flag == 0)
				{
					continue;
				}
				else
				{
					flag = 1;
				}
				if (flag == 1)
				{
					System.out.print(num[j]);
				}
			}
		}
		else
		{
			System.out.print("1");
		}
		System.out.print("\n");

		return 0;
	}
}

