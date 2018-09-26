package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int f = new int(int M,int N);
		int t;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		int[][] a = new int[20][2];
		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i][1] = Integer.parseInt(tempVar3);
			}
		}

		for (i = 0;i < t;i++)
		{
			System.out.printf("%d\n",f(a[i][0], a[i][1]));
		}
		return 0;
	}

	public static int f(int M,int N)
	{
		int w;
		if (M <= 1 || N <= 1)
		{
			w = 1;
		}
		else if (M < N)
		{
			w = f(M, M);
		}
			//w=f(M,M-1)+f(M,M-2);
		else
		{
			w = f(M - N, N) + f(M, N - 1);
		}
		return w;
	}

}

