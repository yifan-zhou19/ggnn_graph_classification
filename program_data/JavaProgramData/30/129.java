package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int sum = 0;
		int i;
		int j;
		int p;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			sum = sum + i * i;
		}
		j = n / 7;
		for (i = 1;i <= j;i++)
		{
			sum = sum - 7 * i * 7 * i;
		}
		p = n / 70;
		q = n / 10;
		if (p == 1)
		{
			for (i = 1;(i + 70) <= n != 0 && (i + 70) <= 79;i++)
			{
			sum = sum - (70 + i) * (70 + i);
			}
			if (n >= 77)
			{
				sum = sum + 77 * 77;
			}

			for (i = 1;i < q;i++)
			{
				sum = sum - (10 * i + 7) * (10 * i + 7);
			}
			if (n >= 80)
			{
				sum = sum + 77 * 77;
			}

		}
		else
		{
			for (i = 1;i < q;i++)
			{
				sum = sum - (10 * i + 7) * (10 * i + 7);
			}
		}
		if (n >= (10 * q + 7) && n > 7)
		{
			sum = sum - (10 * q + 7) * (10 * q + 7);
		}
		System.out.printf("%d",sum);
		return 0;
	}

}

