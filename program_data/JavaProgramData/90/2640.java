package <missing>;

public class GlobalMembers
{
	public static int num(int m, int n)
	{
	 if (m <= 1)
	 {
		 return 1;
	 }
	 if (n == 1)
	 {
		 return 1;
	 }
	 int sum = 0;
	 int i;
	 for (i = 1; i <= n; i++)
	 {
	  if (i > m)
	  {
		  break;
	  }
	  sum += num(m - i, i);
	 }
	 return sum;
	}
	public static int Main()
	{
	 int n;
	 int i;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 0; i < n; i++)
	 {
	  int M;
	  int N;
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  M = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  N = Integer.parseInt(tempVar3);
	  }
	  int r = num(M, N);
	  System.out.printf("%d\n", r);
	 }
	 return 0;
	}
}

