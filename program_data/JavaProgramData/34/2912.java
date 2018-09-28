package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int j;
	  int k;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  if (n == 1)
	  {
		  System.out.print("End\n");
	  }
	  else
	  {
		  while (n != 1)
		  {
		  if (n % 2 == 0)
		  {
			  j = n / 2;
			  System.out.printf("%d/2=%d\n",n,j);
		  }
	  else
	  {
		  j = n * 3 + 1;
		  System.out.printf("%d*3+1=%d\n",n,j);
	  }
	  n = j;
		  }
	  System.out.print("End\n");
	  }

	return 0;
	}

}

