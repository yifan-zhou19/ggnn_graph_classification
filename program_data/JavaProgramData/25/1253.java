package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] num = new int[1005];
		int flag = 0;
		int p = 1;
		int j;
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i <= 1004; i++)
		{
			num[i] = 10;
		}
		if (n == 0)
		{
			System.out.print("1");
			System.out.print("\n");
		}
		else
		{
			num[1000] = 1;
			for (i = 1; i <= n; i++)
			{
				t = p;
				for (j = 1000; j >= 1000 - p + 1; j--)
				{
					num[j] = num[j] * 2 + flag;
					flag = 0;
					if (num[j] >= 10)
					{
						num[j] = num[j] - 10;
						flag = 1;
						if (num[j - 1] == 10)
						{
							num[j - 1] = 1;
							flag = 0;
							t++;
						}
					}
				}
				p = t;
			}
			if (num[1000 - p + 1] == 0)
			{
				num[1000 - p + 1] = 1;
			}
			for (i = 1000 - p + 1; i <= 1000; i++)
			{
				System.out.print(num[i]);
			}
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}
}

