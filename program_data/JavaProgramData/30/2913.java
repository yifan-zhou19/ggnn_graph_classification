package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			int a;
			int n;
			int i = 1;
			int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i <= n)
		{
			if (i % 7 == 0 || i / 10 == 7 || i - i / 10 * 10 == 7)
			{
			sum = sum;
			i++;
			}
			else
			{
				sum += i * i;
				i++;

			}
		}

		System.out.printf("%d",sum);
		return 0;
	}
}

