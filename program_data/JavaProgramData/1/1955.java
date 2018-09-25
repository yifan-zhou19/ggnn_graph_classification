package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int f = new int(int k,int m);
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 1;i <= n;i++)
		{
			int k;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				k = Integer.parseInt(tempVar2);
			}
			System.out.printf("%d\n",f(k, 2));
		}

		return 0;
	}
	public static int f(int k,int m)
	{
		int i;
		int j = 0;
		if (k <= m)
		{
			if (k == m)
			{

			j = 1;
			return j;
			}
			else
			{
				j = 0;
				return j;
			}
		}
		else
		{
		for (i = m;i <= k;i++)
		{
			if (k % i == 0 && k / i != 1)
			{
				j = j + f(k / i, i);
			}
			if (k % i == 0 && k / i == 1)
			{
				j = j + 1;
			}
		}
		return j;
		}

	}
}

