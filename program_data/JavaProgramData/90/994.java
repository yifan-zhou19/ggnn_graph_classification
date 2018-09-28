package <missing>;

public class GlobalMembers
{
	public static int much(int M,int N)
	{
		int x;
		if (N == 1 || M == 0)
		{
			x = 1;
		}
		else if (M < N)
		{
			x = much(M, M);
		}
		else
		{
			x = much(M, N - 1) + much(M - N, N);
		}
		return x;
	}
	public static void Main()
	{
		int n;
		int M;
		int N;
		int i;
		int a;
		int b;
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
				M = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				N = Integer.parseInt(tempVar3);
			}
			a = much(M, N);
			System.out.printf("%d\n",a);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			b = Integer.parseInt(tempVar4);
		}
	}
}

