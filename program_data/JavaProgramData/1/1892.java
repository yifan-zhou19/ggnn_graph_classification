package <missing>;

public class GlobalMembers
{
	public static int ans = 0;
	public static int work(int p,int k)
	{
		if (p == 1)
		{
			ans++;
			return (p * k,k);
		}
		for (int i = k;i <= p;i++)
		{
			if (p % i == 0)
			{
				work(p / i, i);


			}
		}
	}
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n-- != 0)
		{
			ans = 0;
			int t;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				t = Integer.parseInt(tempVar2);
			}
			work(t, 2);
			//ans = work(t);
			System.out.printf("%d\n",ans);
		}

		return 0;
	}
}

