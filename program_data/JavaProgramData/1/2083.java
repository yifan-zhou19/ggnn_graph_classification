package <missing>;

public class GlobalMembers
{
	public static int fenjie(int n,int min)
	{
	int x = 0;
	int i;
	if (n == 1)
	{
	return 1;
	}
	else
	{
		for (i = min;i <= n;i++)
		{
			if (n % i == 0)
			{
			x = x + fenjie(n / i, i);
			}
		}
	}
	return x;
	}
	public static int Main()
	{
		int shu;
		int number;
		int count = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			number = Integer.parseInt(tempVar);
		}
		while (count < number)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				shu = Integer.parseInt(tempVar2);
			}
			System.out.printf("%d\n",fenjie(shu, 2));
		count++;
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			shu = Integer.parseInt(tempVar3);
		}
		System.out.printf("%d",fenjie(shu, 2));

	}
}

