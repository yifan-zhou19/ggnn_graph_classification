package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n)
	{
	  if (n == 1)
	  {
		  return 1;
	  }
	  if (n > m)
	  {
		  return (f(m, m));
	  }
	  if (n == m)
	  {
		  return (f(m, m - 1) + 1);
	  }
	  if (n < m)
	  {
		  return (f(m, n - 1) + f(m - n, n));
	  }

	}

	public static int Main()
	{
	 int f = new int(int m,int n);
	 int i;
	 int n;
	 int M;
	 int N;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 1;i <= n;i++)
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
	  f(M, N);
	  System.out.printf("%d\n",f(M, N));
	 }

	}
}

