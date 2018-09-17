package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int p;
	  int q;
	  void y(int n,int m);
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  q = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  p = Integer.parseInt(tempVar2);
	  }
	  y(p, q);
	  return 0;
	}
	public static void y(int n,int m)
	{
	  if (n == m)
	  {
	  System.out.printf("%d",n);
	  }
	  else if (m > n)
	  {
		if (m >= (2 * n))
		{
		  y(m / 2, n);
		}
		 else if (m < (2 * n))
		 {
		  y(m / 2, n / 2);
		 }
	  }
	   else
	   {
		  y(m, n);
	   }
	}

}

