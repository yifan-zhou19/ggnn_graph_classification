package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int digit;
		int res = 0;
		int t;
		int cnt1 = 0;
		int cnt2 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			cnt1 = 0;
			t = (int)Math.sqrt(i);
			for (j = 2;j <= t;j++)
			{
				if (i % j == 0)
				{
					cnt1++;
				}
			}
			if (cnt1 == 0)
			{
				k = i;
				res = 0;
				while (k != 0)
				{
					digit = k % 10;
					res = res * 10 + digit;
					k /= 10;
				}
				if (res == i)
				{
					if (cnt2 == 0)
					{
						System.out.printf("%d",res);
						cnt2++;
					}
					else
					{
						System.out.printf(",%d",res);
						cnt2++;
					}
				}
			}
		}
		if (cnt2 == 0)
		{
		System.out.print("no");
		}
	}
}

