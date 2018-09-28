package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int now;
		  int i;
		  int j;
		  int ok;
		  int ok2;

		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  now = 2;
		  ok2 = 0;
		  if (n > 2)
		  {
				  for (i = 3;i <= n;i++)
				  {
						 ok = 1;
						 for (j = 2;j <= (int)(Math.sqrt(i));j++)
						 {
							 if (i % j == 0)
							 {
								 ok = 0;
								 break;
							 }
						 }
						 if (1 == ok)
						 {
							 if (2 == i - now)
							 {
								 System.out.printf("%d %d\n",now,i);
								 if (0 == ok2)
								 {
									 ok2 = 1;
								 }
							 }
							 now = i;
						 }
				  }
				  if (0 == ok2)
				  {
					  System.out.print("empty\n");
				  }
		  }
		  else
		  {
			  System.out.print("empty\n");
		  }
		  return 0;
	}

}

