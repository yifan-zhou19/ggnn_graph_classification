package <missing>;

public class GlobalMembers
{
	public static int calc(int p, int t)
	{
		int i;
		int a;

		a = 1;
		for (i = p;i <= Math.sqrt(t);i++)
		{
			if (t % i == 0)
			{
				a = a + calc(i, t / i);
			}
		}
		return a;

	}

	public static int Main()
	{
		int m;
		int n;
		int ans;


		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}

		while (m-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			ans = calc(2, n);
			System.out.printf("%d\n",ans);
		}


		return 0;

	}
}

