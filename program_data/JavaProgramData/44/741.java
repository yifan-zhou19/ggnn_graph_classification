package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int reverse = int sum;
		int sum;
		int i;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				sum = Integer.parseInt(tempVar);
			}
			reverse(sum);
		}


		return 0;
	}

	public static int reverse(int sum)
	{
		int yushu;
		if (sum < 0)
		{
			System.out.print("-");
			sum = -sum;
		}
		if (sum == 0)
		{
			System.out.printf("%d",sum);
		}
		yushu = sum % 10;
		while ((yushu == 0) && (sum != 0))
		{
			sum = sum / 10;
			yushu = sum % 10;
		}

		while (sum != 0)
		{
			System.out.printf("%d",yushu);
			sum = (sum - yushu) / 10;
			yushu = sum % 10;
		}
		System.out.print("\n");
		return 0;
	}
}

