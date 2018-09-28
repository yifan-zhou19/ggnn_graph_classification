package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sum;
		int flag;
		int n;
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			sum = 0;
			for (int i = 1; i <= n; i++)
			{
				flag = 0;
				if (i % 7 == 0)
				{
					continue;
				}
				int tmp = i;
				while (tmp != 0)
				{
					if (tmp % 10 == 7)
					{
						flag = 1;
					}
					tmp = tmp / 10;
				}
				if (flag == 1)
				{
					continue;
				}
				sum = sum + i * i;
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}

}

