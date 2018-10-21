package <missing>;

public class GlobalMembers
{
	public static int prime(int num)
	{
		int i;
		if (num % 2 == 0)
		{
			return 0;
		}
		else
		{
			for (i = 3;i < num;i += 2)
			{
			if (num % i == 0)
			{
				break;
			}
			}
		if (i == num)
		{
			return 1;
		}
		else
		{
			return 0;
		}
		}
	}
	public static int Main()
	{
		int num;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= num / 2;i += 2)
		{
			if (prime(i) != 0 && prime(num - i) != 0)
			{
				System.out.printf("%d %d\n",i,num - i);
			}
		}
		return 0;
	}

}

