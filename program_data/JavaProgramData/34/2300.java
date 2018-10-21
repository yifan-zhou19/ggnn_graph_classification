package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int k;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
		while (n > 1)
		{
			if (n % 2 == 1)
			{
				 System.out.printf("%d*3+1=%d\n",n,(n * 3 + 1));
				 n = n * 3 + 1;
			}
			  if (n % 2 == 0)
			  {
				  System.out.printf("%d/2=%d\n",n,(n / 2));
				 n = n / 2;
			  }
		}
		 System.out.print("End");
	return 0;
	}
}

