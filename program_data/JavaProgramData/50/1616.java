package <missing>;

public class GlobalMembers
{
	public static int[] mon = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 0, 0};

	public static int Main()
	{
		int we1;
		int i;

		int[] mon = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 0, 0};

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			we1 = Integer.parseInt(tempVar);
		}

		int judge = new int(int x,int y);

		for (i = 1;i < 13;i++)
		{
			if (judge(we1, i) == 1)
			{
				System.out.printf("%d\n",i);
			}
		}

		return 0;
	}

	public static int judge(int x,int y)
	{
		int sum = 0;
		int i;

		for (i = 0;i < y - 1;i++)
		{
			sum += mon[i];
		}

		sum += 13;

		if ((sum + x - 1) % 7 == 5)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}


}

