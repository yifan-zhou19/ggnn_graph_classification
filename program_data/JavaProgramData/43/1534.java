package <missing>;

public class GlobalMembers
{
	public static int sushu(int a)
	{
	int flag = 1;
	int m;
	int i;
	m = Math.sqrt(a);
	for (i = 2;i <= m;i++)
	{
	if (a % i == 0)
	{
		flag = 0;
	}
	}
	return flag;
	}

	public static int Main()
	{
		int m;
		int x;
		int y;
		int k;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}

		for (k = 3;k <= m / 2;k += 2)
		{
			if (sushu(k) != 0 && sushu(m - k) != 0)
			{
				System.out.printf("%d %d\n",k,m - k);
			}
		}

		return 0;
	}

}

