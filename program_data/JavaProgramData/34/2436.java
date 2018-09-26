package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int a;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		   while (n - 1 > 0)
		   {
			  if (n % 2 == 0)
			  {
			  n = n / 2;
			  a = 2 * n;
			  System.out.printf("%d/2=%d\n",a,n);
			  }
		  else
		  {
			  n = 3 * n + 1;
			 a = (n - 1) / 3;
			 System.out.printf("%d*3+1=%d\n",a,n);
		  }

		   }
		  System.out.print("End");

	}

}

