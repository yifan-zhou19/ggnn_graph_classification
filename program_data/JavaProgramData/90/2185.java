package <missing>;

public class GlobalMembers
{
	public static int hanshu(int n,int M)
	{
		if (n == 1)
		{
			return 1;
		}
		int a;
		if (M < n)
		{
			a = 0;
		}
		if (M == n)
		{
			a = 1;
		}
		if (M > n)
		{
			a = hanshu(n, M - n);
		}
		return hanshu(n - 1, M) + a;
	}
	public static int Main()
	{
		int t;
		int M;
		int N;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				M = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				N = Integer.parseInt(tempVar3);
			}
			System.out.printf("%d\n",hanshu(N, M));
		}

	}
}

