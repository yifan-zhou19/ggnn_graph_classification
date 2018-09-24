package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int[] num = new int[101];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		num[0] = 2;
		if (n == 0)
		{
			System.out.print('1');
			System.out.print("\n");
		}
		else
		{
			while (n > 1)
			{
				for (i = 100;i >= 0;i--)
				{
					if (num[i] != 0)
					{
						break;
					}
				}
				for (j = 0;j <= i;j++)
				{
					num[j] = num[j] * 2;
				}
				for (j = 0;j <= i;j++)
				{
					if (num[j] >= 10)
					{
						num[j] = num[j] - 10;
						num[j + 1] = num[j + 1] + 1;
					}
				}
				n--;
			}
			for (i = 100;i >= 0;i--)
			{
				if (num[i] != 0)
				{
					break;
				}
			}
			for (j = i;j >= 0;j--)
			{
				System.out.print(num[j]);
			}
			System.out.print("\n");
		}
			return 0;
	}


}

