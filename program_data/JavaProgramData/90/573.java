package <missing>;

public class GlobalMembers
{
	public static int func(int M,int N)
	{
		int ans;
		if (N == 1)
		{
			ans = 1;
		}
		else if (M > N)
		{
			ans = func(M, N - 1) + func(M - N, N);
		}
		else if (M == N)
		{
			ans = func(M, N - 1) + 1;
		}
		else
		{
			ans = func(M, N - 1);
		}
		return ans;
	}
	public static int Main()
	{
		int m;
		int n;
		int t;
		int i;
		int[] k = new int[20];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			k[i] = func(m, n);
		}

		for (i = 0;i < t;i++)
		{
			System.out.printf("%d\n",k[i]);
		}
		return 0;
	}



}

