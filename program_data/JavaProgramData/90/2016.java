package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int check = new int(int M,int N);
		int m;
		int n;
		int t;
		int i;
		int[] K = new int[20];
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			K[i] = check(m, n);
		}
		for (i = 0;i < t;i++)
		{
			System.out.printf("%d\n",K[i]);
		}

		return 0;
	}

	public static int check(int M,int N)
	{
		int s = 0;
		if ((M == 1) || (N == 1))
		{
			s = s + 1;
		}
		else
		{
			if (M == N)
			{
				s = s + 1 + check(M, N - 1);
			}
			else
			{
				if (M > N)
				{
					s = s + check(M - N, N) + check(M, N - 1);
				}
				else
				{
					s = s + check(M, M);
				}
			}
		}
		return (s);
	}

}

