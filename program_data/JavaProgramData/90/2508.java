package <missing>;

public class GlobalMembers
{
	public static int num(int M,int N)
	{
		if (M > N && N != 1)
		{
		   return num(M - N, N) + num(M, N - 1);
		}
		else if (M == N)
		{
		   return num(M, N - 1) + 1;
		}
		else if (M <= N != 0 && M != 1)
		{
		   return num(M, M);
		}
		else if (M == 1 || N == 1)
		{
		   return 1;
		}
	}
	public static int Main()
	{
		  int t;
		  int i = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  t = Integer.parseInt(tempVar);
		  }
		  while (i < t)
		  {
					 int M;
					 int N;
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
					 int situation;
					 situation = num(M, N);
					 System.out.printf("%d\n",situation);
					 i = i + 1;
		  }
	}

}

