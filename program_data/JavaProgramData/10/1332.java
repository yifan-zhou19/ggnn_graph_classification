package <missing>;

public class GlobalMembers
{
	// ????.cpp : ??????????????
	//



	public static int f(int a, int[] array, int K)
	{
		int i;
		int max = 0;
		int j;
		if (a == K - 1)
		{
			return 1;
		}
		else
		{
			for (j = K - 1;j > a;j--)
			{
				if (array[j] <= array[a])
				{
					if (f(j, array, K) > max)
					{
						max = f(j, array, K);
					}
				}
			}
			return max + 1;
		}


	}
	public static int Main() //(int argc, _TCHAR* argv[])
	{
		int K;
		int k;
		int[] A = new int[25];
		int n;
		int max = 1;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			K = Integer.parseInt(tempVar);
		}
		for (k = 0;k <= K - 1;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				A[k] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i <= K - 1;i++)
		{
			if (f(i, A, K) > max)
			{
				max = f(i, A, K);
			}
		}
		System.out.printf("%d",max);

	}


}

