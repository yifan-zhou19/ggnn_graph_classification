package <missing>;

public class GlobalMembers
{
	public static int f(int m, int n)
	{
		int q;
		if (n > m)
		{
			n = m;
		}
		if (m == 1 || n == 1 || m == 0)
		{
			return (1);
		}
		q = f(m - n, n) + f(m, n - 1);
		return (q);
	}

	public static int Main()
	{
		  int i;
		  int j;
		  int k;
		  int n;
		  int m;
		  int t;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  t = Integer.parseInt(tempVar);
		  }
		  while (t-- != 0)
		  {

			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  m = Integer.parseInt(tempVar2);
			  }
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  n = Integer.parseInt(tempVar3);
			  }
			  k = f(m, n);
			  System.out.printf("%d\n",k);

		  }

		  return 0;
	}


}

