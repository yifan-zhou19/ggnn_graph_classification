package <missing>;

public class GlobalMembers
{
	public static int prime(int a) //a must be an odd.
	{
	  int k;
	  int m;
	  m = 1;
	   for (k = 3;k <= Math.sqrt(a);k++)
	   {
		  if (a % k == 0)
		  {
		   m = 0;
		   break;
		  }
	   }
	   return m;
	}
	public static int Main()
	{
	 int n;
	 int i;
	 int j;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 6;i <= n;i += 2)
	 {
	   for (j = 3;j < i;j += 2)
	   {
		  if (prime(j) == 1 && prime(i - j) == 1)
		  {
			  System.out.printf("%d=%d+%d\n",i,j,i - j);
			  break;
		  }
	   }
	 }
	}
}

