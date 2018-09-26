package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int n;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  if (n == 1)
	  {
		  System.out.print("End");
	  }
	  else
	  {
		  for (;;)
		  {
		  if (n % 2 == 0)
		  {
			  n = n / 2;
			  System.out.printf("%d/2=%d\n",2 * n,n);
			  if (n == 1)
			  {
				  System.out.print("End\n");
				  break;
			  }
		  }
	  else
	  {
		  n = n * 3 + 1;
		  System.out.printf("%d*3+1=%d\n",(n - 1) / 3,n);
		  {
			  if (n == 1)
			  {
				  System.out.print("End\n");
				  break;
			  }
		  }
	  }
		  }
	  }
	}


}

