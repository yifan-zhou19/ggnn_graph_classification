package <missing>;

public class GlobalMembers
{
	public static int apple(int M,int N)
	{
		if (M == 1)
		{
		return 1;
		}
		if (N == 1)
		{
		return 1;
		}
		if (M != 1 && N != 1)
		{
			if (M > N)
			{
			return apple(M, N - 1) + apple(M - N, N);
			}
			else if (M == N)
			{
			return apple(M, N - 1) + 1;
			}
			else
			{
			return apple(M, M);
			}
		}
	}
	public static int Main()
	{
		  int t;
		  int i;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  t = Integer.parseInt(tempVar);
		  }
		  int[] M;
		  int[] N;
		  M = new int[t];
		  N = new int[t];
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
			 System.out.printf("%d\n",apple(M[i], N[i]));
		  }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		  free(M);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		  free(N);
	}

}

