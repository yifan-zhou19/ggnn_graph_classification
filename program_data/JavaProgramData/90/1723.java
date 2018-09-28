package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int t;
		int i;
		int[] M = new int[21];
		int[] N = new int[21];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		int f = new int(int M,int N);
		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				M[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				N[i] = Integer.parseInt(tempVar3);
			}
			System.out.printf("%d\n",f(M[i], N[i]));
		}
	}

	public static int f(int M,int N)
	{
		int c;
		if (N == 1 || M == 1 || M == 0)
		{
			c = 1;
		}
		else if (M >= N)
		{
			c = f(M, N - 1) + f(M - N, N);
		}
		else
		{
			c = f(M, N - 1);
		}
		return c;
	}
}

