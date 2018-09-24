package <missing>;

public class GlobalMembers
{
	public static int sushu(int k)
	{
		int i;
		double m;
		if (k > 10)
		{
			m = Math.sqrt(k);
		}
		else
		{
			m = k - 1;
		}
		if (k % 2 == 0)
		{
			return 0;
		}
		for (i = 3;i <= m;i += 2)
		{
			if ((k % i) == 0)
			{
				break;
			}
		}
		if (i <= m)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}


	public static int Main()
	{
		int n;
		int x;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 6;k <= n;k += 2)
		{
			for (x = 3;x <= k;x++)
			{
				j = k - x;
				if (sushu(x) != 0 && sushu(j) != 0)
				{
					System.out.printf("%d=%d+%d\n",k,x,j);
					break;
				}
			}
		}





		return 0;
	}
}

