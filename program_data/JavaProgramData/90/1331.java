package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n)
	{
		int c;
		if (m == 1 || n == 1 || m == 0)
		{
					   c = 1;
		}
		else
		{
		if (m < n)
		{
				  c = f(m, m);
		}
		else
		{
				  c = f(m, n - 1) + f(m - n, n);
		}
		}
		return (c);
	}
	public static int Main()
	{
		  int t;
		  int m;
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  t = Integer.parseInt(tempVar);
		  }
		  int i = 0;
		  for (i = 0;i <= t - 1;i++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  m = Integer.parseInt(tempVar2);
			  }
			  String tempVar3 = ConsoleInput.scanfRead(" ");
			  if (tempVar3 != null)
			  {
				  n = Integer.parseInt(tempVar3);
			  }
			  System.out.printf("%d\n",f(m, n));
		  }
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}


}

