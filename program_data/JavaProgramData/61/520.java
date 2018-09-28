package <missing>;

public class GlobalMembers
{
	public static int feibo(int a)
	{
		int result;
		int i;
		int result1;
		int result2;
		if (a <= 2)
		{
			result = 1;
			return result;
		}
		else
		{
			result1 = 1;
			result2 = 1;
			for (i = 1;i <= a - 2;i++)
			{
				result = result1 + result2;
				result1 = result2;
				result2 = result;
			}
			return result;
		}
	}
	public static int Main()
	{
		int k;
		int[] sz = new int[100];
		int i;
		int[] szresult = new int[100];
		sz[100] = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= k - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i <= k - 1;i++)
		{
			szresult[i] = feibo(sz[i]);
		}
		for (i = 0;i <= k - 1;i++)
		{
			System.out.printf("%d\n",szresult[i]);
		}
		return 0;
	}
}

