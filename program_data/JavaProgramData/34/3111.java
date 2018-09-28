package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int m;
		  int n;
		  int e;
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
	  do
	  {
		  if (n % 2 == 0)
		  {
		  System.out.printf("%d/%d=%d\n",n,2,m = n / 2);
		  n = n / 2;
		  }
		  else
		  {
		  System.out.printf("%d*%d+%d=%d\n",n,3,1,e = n * 3 + 1);
		  n = n * 3 + 1;
		  }
	  } while (n != 1);
		  System.out.print("End\n");
		  }
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}
}

