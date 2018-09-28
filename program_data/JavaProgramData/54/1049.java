package <missing>;

public class GlobalMembers
{
	public static int total(int n,int k) //?????????
	{
		int m;
		int i;
		int t = 1;
		int count = 0;

		while (true)
		{
		m = n * t + k;

		for (i = 1;i < n;i++)
		{
			if (m % (n - 1) != 0)
			{
				t++;
			count = 0;
			break;
			}
			else
			{
			count++;
			}
			m = m / (n - 1) * n + k;
		}

		if (count != 0)
		{
			return m;
		}
		}
	}

	public static int Main()
	{
		int n;
		int k;
		int m;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		m = total(n, k);
		System.out.printf("%d",m);

		return 0;
	}

}

