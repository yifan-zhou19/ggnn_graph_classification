package <missing>;

public class GlobalMembers
{
	public static int yuqiwuguan(int number)
	{
		if (number % 7 == 0)
		{
			return 0;
		}
		for (int num = number;num > 0;num = num / 10)
		{
			if (num % 10 == 7)
			{
				return 0;
			}

		}
		return 1;
	}

	public static int Main()
	{
		int i;
		int sum;
		int n;
		sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			if (yuqiwuguan(i) != 0)
			{
				sum = sum + i * i;
			}
		}
		System.out.printf("%d",sum);
		return 0;
	}
}

