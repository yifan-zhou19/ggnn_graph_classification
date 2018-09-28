package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int reverse = int num;
		int i;
		int a;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a = Integer.parseInt(tempVar);
			}
			System.out.printf("%d\n",reverse(a));
		}
		return 0;
	}
	public static int reverse(int num)
	{
	int s = 0;
	if (num * num < 100)
	{
	s = num;
	}
	else if (num * num < 10000)
	{
	s = num % 10;
	s = s * 10 + (num / 10) % 10;
	}
	else if (num * num < 1000000)
	{
	s = num % 10;
	s = s * 10 + (num / 10) % 10;
	s = s * 10 + (num / 100) % 10;
	}
	else if (num * num < 100000000)
	{
	s = num % 10;
	s = s * 10 + (num / 10) % 10;
	s = s * 10 + (num / 100) % 10;
	s = s * 10 + (num / 1000) % 10;
	}
	else
	{
	s = num % 10;
	s = s * 10 + (num / 10) % 10;
	s = s * 10 + (num / 100) % 10;
	s = s * 10 + (num / 1000) % 10;
	s = s * 10 + (num / 10000) % 10;
	}

	return s;
	}
}

