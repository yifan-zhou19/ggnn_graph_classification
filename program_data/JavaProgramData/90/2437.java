package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int f = new int(int M,int N);
		int i;
		int j;
		int k;
		int zu;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			zu = Integer.parseInt(tempVar);
		}
		for (k = 0;k < zu;k++)
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
		System.out.printf("%d\n",f(m, n));
		}

	}


	public static int f(int M,int N)
	{
	if ((N == 1) || (M == 1))
	{
		return 1;
	}
	else
	{
		if (M - N > 0)
		{
		return (f(M, N - 1) + f(M - N, N));
		}
		else
		{
			if (M == N)
			{
				return (f(M, N - 1) + 1);
			}
			else
			{
			return f(M, N - 1);
			}
		}
	}

	}
}

