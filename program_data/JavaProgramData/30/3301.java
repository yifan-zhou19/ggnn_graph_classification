package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			if (i % SHENMI == 0)
			{
				continue;
			}
			if ((SHENMI * 10 < i) && ((SHENMI + 1) * 10 > i))
			{
				continue;
			}
			j = i / 10;
			if (((i - j * 10) % SHENMI == 0) && ((i - j * 10) != 0))
			{
				continue;
			}
			sum += i * i;
		}
		System.out.printf("%d\n",sum);
		return 0;
	}
}

