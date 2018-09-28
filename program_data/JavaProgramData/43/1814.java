package <missing>;

public class GlobalMembers
{
	public static int S(int x)
	{
	   int i;
	   int k;
	   int r = 0;
	  k = Math.sqrt(x);
	 for (i = 2;i <= k;i++)
	 {
	   if (x % i == 0)
	   {
			 r = 1;
			 break;
	   }
	 }
	   return r;
	}
	public static int Main()
	{
	  int m;
	  int i;
	  int x;
	  int y;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }
	  for (i = 3;i <= m / 2;i++)
	  {
		 if (S(i) == 0 && S(m - i) == 0)
		 {
	  System.out.printf("%d %d\n",i,m - i);
		 }
	  }
	  return 0;
	}
}

