package <missing>;

public class GlobalMembers
{
	public static int factor(int a,int b)
	{
			int i;
			int ways;
			ways = 1;
			if (a < b)
			{
				return 0;
			}
			for (i = b;i <= Math.sqrt(a);i++)
			{
				if (a % i == 0)
				{
					ways += factor(a / i, i);
				}
			}
			return ways;
	}

	public static int Main()
	{
		int n;
		int[] A = new int[99];
		int[] K = new int[99];
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				A[i] = Integer.parseInt(tempVar2);
			}
			K[i] = factor(A[i], 2);
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",K[i]);
		}

		return 0;
	}

}

