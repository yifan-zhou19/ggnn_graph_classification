package <missing>;

public class GlobalMembers
{
	public static int yu7wuguan(int n)
	{
		if (n % 7 == 0)
		{
			return 0;
		}
		for (int i = n;i > 0;i /= 10)
		{
			if (i % 10 == 7)
			{
				return 0;
			}
		}
		return 1;
	}


	public static int Main()
	{
		int n;
		int sum = 0;
		int y = 0;
		int i = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			y = 0;
			if (yu7wuguan(i) != 0)
			{

				sum += i * i;
			}

		}
		System.out.printf("%d",sum);
		return 0;
	}

}

