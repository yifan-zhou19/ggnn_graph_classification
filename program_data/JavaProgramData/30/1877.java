package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int l;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 1;i <= n;i++)
		{
			   l = i % 10;
		  k = (i - l) / 10;
			if (i % 7 == 0 || i % 10 == 7 || k % 10 == 7)
			{
				continue;
			}
			sum += i * i;
		}
		System.out.printf("%d", sum);
		return 0;
	}
}

