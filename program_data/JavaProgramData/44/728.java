package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int i;
		int j;
		int y = 0;
		for (i = 100000000;i >= 1;i = i / 10)
		{
			if (num / i != 0)
			{
				for (j = 1;j <= i;j = j * 10)
				{
					y = 10 * y + num % 10;
					num = num / 10;
				}
				return y;
			}

		}
		return 0;
	}
	public static int Main()
	{
		int num;
		int i;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				num = Integer.parseInt(tempVar);
			}
			System.out.printf("%d\n",reverse(num));
		}
		return 0;
	}
}

