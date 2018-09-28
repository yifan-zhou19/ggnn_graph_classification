package <missing>;

public class GlobalMembers
{
	public static int p = 0;
	public static int move(int M,int N)
	{
		if (M == 0 || N == 1)
		{
		return 1;
		}
		else if (M < N)
		{
		 return (move(M, M));
		}
		else if (M >= N)
		{
		 return (move(M - N, N) + move(M, N - 1));
		}
	}


	public static int Main()
	{
		int i;
		int p;
		int[] M = new int[20];
		int[] N = new int[20];
		int[] K = new int[20];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p = Integer.parseInt(tempVar);
		}
		for (i = 0;i < p;i++)
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
			K[i] = move(M[i], N[i]);
			System.out.printf("%d\n",K[i]);
		}
			 return 0;
	}
}

