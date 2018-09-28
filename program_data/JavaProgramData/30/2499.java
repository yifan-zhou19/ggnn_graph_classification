package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int sum = 0;
		int i = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i <= n)
		{
			if (i % 7 == 0)
			{
				i++;
				continue;
			}
			if (i / 10 == 7)
			{
				i++;
				continue;
			}
			if (i % 10 == 7)
			{
				i++;
				continue;
			}
			sum += i * i;
			i++;
		}
		System.out.printf("%d",sum);
	}
}

