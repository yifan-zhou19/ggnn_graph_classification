package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[] M = new int[10];
	 int[] N = new int[10];
	 int[] K = new int[10];
	 int t;
	 int i;
	 int j;
	 int noblank = new int(int M,int N);
	 int MTOblank = new int(int M,int N);
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
			 M[i] = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 N[i] = Integer.parseInt(tempVar3);
		 }
	  K[i] = noblank(M[i], N[i]) + MTOblank(M[i], N[i]);
	 }
	 for (j = 0;j < t;j++)
	 {
	 System.out.printf("%d\n",K[j]);
	 }
	}

	public static int noblank(int M,int N)
	{
		int K;
		int MTOblank = new int(int M,int N);
		if (M > N)
		{
			K = noblank(M - N, N) + MTOblank(M - N, N);
		}
		if (M == N)
		{
			K = 1;
		}
		if (M < N)
		{
			K = 0;
		}

		return K;
	}

	public static int MTOblank(int M,int N)
	{
		int K;
		int noblank = new int(int M,int N);
		if (N == 2)
		{
			K = 1;
		}
		else
		{
			if (N == 1)
			{
				K = 0;
			}
				 else
				 {
					 if (M < N - 1)
					 {
						 K = MTOblank(M, N - 1);
					 }
					   else
					   {
						   K = MTOblank(M, N - 1) + noblank(M, N - 1);
					   }
				 }
		}
		return K;

	}
}

