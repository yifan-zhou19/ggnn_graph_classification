package <missing>;

public class GlobalMembers
{
	public static int judge(int num)
	{
		if (num % 7 == 0)
		{
			return 0;
		}
		while (num > 0)
		{
			if ((num - 7) % 10 == 0)
			{
				return 0;
			}
			num /= 10;
		}
		return 1;
	}
	public static void Main()
	{
		int i;
		int num;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= num;i++)
		{
			if (judge(i) == 1)
			{
				sum += i * i;
			}
		}
		System.out.printf("%d\n",sum);
	}

}

