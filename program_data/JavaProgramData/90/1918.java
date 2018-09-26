package <missing>;

public class GlobalMembers
{
	public static int s = 0;
	public static int f(int M,int N)
	{
	  if ((M > 0) && (N > 0))
	  {
		if ((N == 1) || (M == 1))
		{
			s = s + 1;
		}
		else if ((M <= N) && (M != 1) && (N != 1))
		{
			s = s + 1;
			f(M, M - 1);
		}
		else
		{

		 f(M, N - 1);
		 f(M - N, N);
		}
	  }
	  return s;

	}
	 public static int Main()
	 {
	  int t;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  t = Integer.parseInt(tempVar);
	  }
	  for (int i = 0;i <= t - 1;i++)
	  {
	 int a;
	 int b;
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 a = Integer.parseInt(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead(" ");
	 if (tempVar3 != null)
	 {
		 b = Integer.parseInt(tempVar3);
	 }
	 System.out.printf("%d\n",f(a, b));
	 s = 0;
	  }
	 int y;
	 String tempVar4 = ConsoleInput.scanfRead();
	 if (tempVar4 != null)
	 {
		 y = Integer.parseInt(tempVar4);
	 }
	 return 0;
	 }

}

