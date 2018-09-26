package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  k = n;
	  while (k != 1)
	  {
		  if (n % 2 == 0)
		  {
		  k = n / 2;
		  System.out.printf("%d/%d=%d\n",n,2,k);
		  n = k;
		  }
	   else
	   {
		   k = n * 3 + 1;
		   System.out.printf("%d*%d+%d=%d\n",n,3,1,k);
		   n = k;
	   }
	  }
	  System.out.print("End");
	  return 0;
	}
}

