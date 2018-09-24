package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int temp = 0;
		int sum = 0;
		int ans = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			temp = i * i;
			sum += temp;
		}
		for (i = 1;i <= n;i++)
		{
			if (i % 7 == 0 || i / 10 == 7 || i % 10 == 7)
			{
				ans += i * i;
			}
		}
		sum = sum - ans;
		System.out.printf("%d",sum);
		return 0;
	}
}

