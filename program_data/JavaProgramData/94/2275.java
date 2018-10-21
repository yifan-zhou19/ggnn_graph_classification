package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		int[] A = new int[N];
		int t = 0;
		for (int a = 0;a < N;a++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				A[a] = Integer.parseInt(tempVar2);
			}
		} //???????
		for (int b = 0;b < N;b++)
		{
			if (A[b] % 2 != 0)
			{
				t++;
			}
		} //???????????t
		int[] B = new int[t];
		int d = 0;
		for (int c = 0;c < N;c++)
		{
			if (A[c] % 2 != 0)
			{
			   B[d] = A[c];
			   d++;
			}
		} //???A?????????????B
		int i;
		int j;
		int k;
		for (i = 0;i < t;i++)
		{
			for (j = t - 1;j > i;j--)
			{
				if (B[j] < B[j - 1])
				{
					k = B[j];
					B[j] = B[j - 1];
					B[j - 1] = k; //????
				}
			}
		}
		int e = 0;
		for (;e < t - 1;e++)
		{
		   System.out.printf("%d,",B[e]); //???????
		}
		System.out.printf("%d",B[e]);
		return 0;
	}




}

