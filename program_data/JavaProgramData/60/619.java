package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int n1;
		  int n2;
		  int i;
		  int j;
		  int k;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  if (n < 5)
		  {
		  System.out.print("empty");
		  }
		  else
		  {
			  i = 3;
			  while (i < n - 1)
			  {
				n1 = (int)Math.sqrt(i);
				for (j = 2;j <= n1;j++)
				{
					  if (i % j == 0)
					  {
						   break;
					  }
				}
				if (j == n1 + 1)
				{
					  n2 = (int)Math.sqrt(i + 2);
					  j = 2;
					  k = i + 2;
					  for (j = 2;j <= n2;j++)
					  {
						   if (k % j == 0)
						   {
							   break;
						   }
					  }
						   if (j == n2 + 1)
						   {
						   System.out.printf("%d %d\n",i,k);
						   }
				}
				 i = i + 2;
			  }
		  }

	}
}

