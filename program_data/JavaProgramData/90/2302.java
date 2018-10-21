package <missing>;

public class GlobalMembers
{
	public static int devide(int m,int n)
	{
		int full;
		int empty;
		int sum;
		if (n == 2)
		{
		return 1 + m / 2;
		}
		else
		{
		empty = devide(m, n - 1);
		if (m < n)
		{
		full = 0;
		}
		else
		{
		full = devide(m - n, n);
		}
		sum = full + empty;
		return sum;
		}
	}




	public static int Main()
	{
		  int N;
		  int M;
		  int n;
		  int c;
		  int t;
		  int k;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (t = 1;t <= n;t++)
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
		  if (N == 1)
		  {
		  System.out.print("1");
		  }
		  else
		  {
		  System.out.printf("%d",devide(M, N));
		  }
		  System.out.print("\n");
		  }
	}
}

