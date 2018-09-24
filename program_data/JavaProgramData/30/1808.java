package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i = 1;
		for (; i <= n;i++)
		{
			if (i % 7 == 0 || (i > 11) && (int)(i / 10) % 7 == 0 || (i > 7) && i - ((int)(i / 10)) * 10 == 7)
			{
				continue;
			}
				sum += i * i;
		}
		System.out.printf("%d", sum);
		return 0;
	}
}

