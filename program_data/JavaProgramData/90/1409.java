package <missing>;

public class GlobalMembers
{
	public static int q(int M,int N)
	{
	  int K;
	  int y;
	  int w;
	  if (N == 1)
	  {
		  return 1;
	  }
	  if (M < 0)
	  {
		  return 0;
	  }
	  else
	  {
		//y=q(M,N-1);
	   //printf("%d\n",M);
		//w=q(M-N,N);
	   // printf("%d\n",N);
		//K=y+w;
	   // q(M,N)=q(M,N-1)+q(M-N,N);
	   // K=q(M,N);  
	  }
	   return (q(M, N - 1) + q(M - N, N));

	}
	public static int Main()
	{
	 int t;
	 int i;
	 int M;
	 int N;
	 int b;
	 int K;
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
		  M = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  N = Integer.parseInt(tempVar3);
	  }
	   b = q(M, N);
	   System.out.printf("%d\n",b);
	 }
	System.in.read();
	System.in.read();
	 System.in.read();

	}
}

